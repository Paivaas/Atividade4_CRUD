package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Produto;
import com.sun.tools.jconsole.JConsoleContext;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;
        while (continuar){

            System.out.println(".____________________________.");
            System.out.println("|  Sistema de Gerenciamento  |");
            System.out.println("|   de Produtos em Estoque   |");
            System.out.println("|____________________________|");
            System.out.println(" [1] - Cadastrar produtos");
            System.out.println(" [2] - Cadastrar cliente");
            System.out.println(" [3] - Pesquisar produtos");
            System.out.println(" [4] - Consultar Clientes");
            System.out.println(" [5] - Sair");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            Cliente cliente = new Cliente();
            Produto produto = new Produto();
            ClienteController clienteController = new ClienteController();

            if(opcao == 1){
                produto.cadastrarProduto();
            }if(opcao == 2) {
                cliente.cadastrarCliente();
                clienteController.cadastrarClientes(cliente);
            }if(opcao == 4) {
                System.out.println("Informe o CPF do cliente: ");
                String cpfPesquisa = scanner.nextLine();
                clienteController.listarClientes(cpfPesquisa);
            }if(opcao == 5){
                continuar = false;
            }if(opcao == 5){
                continuar = false;
            }
        }
    }
}
