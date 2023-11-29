package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();

    public void listarClientes(String nomePesquisa) throws SQLException {
        Statement statement = connection.createStatement();
        String queryConsulta = "SELECT * FROM clientes";

        ResultSet resultSet = statement.executeQuery(queryConsulta);

        Cliente cliente = new Cliente();

        while(resultSet.next()){
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setEmail(resultSet.getString("email"));

            System.out.println(cliente.getId());
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
            System.out.println(cliente.getEmail());
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }

    }

    public void cadastrarClientes(Cliente cliente) throws SQLException {
        Statement statement = connection.createStatement();
        String queryCadastro = "insert into clientes(nome, cpf, email) values ('"+
                cliente.getNome() +  "','" +  cliente.getCpf() + "','" +
                cliente.getEmail() + "');";

        statement.executeUpdate(queryCadastro);

    }




}
