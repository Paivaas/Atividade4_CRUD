package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Produto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    Conexao conexao=  new Conexao();

    Connection connection = conexao.getConnection();

    public void cadastrarProdutos(Produto produto) throws SQLException {
        Statement statement = connection.createStatement();
        String queryCadastro = "INSERT into produtos (nome, descricao, atributo, preco, quantidade) values ('"+
                produto.getNome() +  "','" +  produto.getDescricao() + "','" +
                produto.getAtributo() +  "'," + produto.getPreco() +  "," + produto.getQuantidade() + ");";

        statement.executeUpdate(queryCadastro);

    }

    public void pesquisarProdutos(int id) throws SQLException {
        Statement statement = connection.createStatement();
        String queryPesquisa = "SELECT * FROM produtos where id='"+id+"'";

        ResultSet resultSet = statement.executeQuery(queryPesquisa);
        List<Produto> produtoList = new ArrayList<>();

        while (resultSet.next()){
           Produto produto =  new Produto();

            produto.setId(resultSet.getInt("id"));
            produto.setNome(resultSet.getString("nome"));
            produto.setDescricao(resultSet.getString("descricao"));
            produto.setAtributo(resultSet.getString("atributo"));
            produto.setPreco(resultSet.getInt("preco"));
            produto.setQuantidade(resultSet.getInt("quantidade"));


            produtoList.add(produto);

        }for(Produto produto : produtoList){

            System.out.println(produto.getId());
            System.out.println("Produto: "+ produto.getNome());
            System.out.println("Descrição: "+ produto.getDescricao());
            System.out.println("-"+ produto.getAtributo());
            System.out.println("R$ "+ produto.getPreco());
            System.out.println("Quantidade em estoque: "+ produto.getQuantidade());
        }
    }

    public void deletarProduto(int id) throws SQLException {

        Statement statement = connection.createStatement();
        String queryDelete = "DELETE from produtos where id='"+id+"'";
        statement.executeUpdate(queryDelete);
        System.out.println("Produto deletado.");
    }

}
