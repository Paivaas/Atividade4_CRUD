package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Produto;

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
            System.out.println(" [1] - Cadastrar produto");
            System.out.println(" [2] - Cadastrar cliente");
            System.out.println(" [3] - Pesquisar produto");
            System.out.println(" [4] - Pesquisar Cliente");
            System.out.println(" Outras funcionalides:");
            System.out.println(" [5] - Deletar Cliente");
            System.out.println(" [6] - Deletar Produto");
            System.out.println(" [7] - Sair");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            Cliente cliente = new Cliente();
            Produto produto = new Produto();
            ClienteController clienteController = new ClienteController();
            ProdutoController produtoController = new ProdutoController();

            if(opcao == 1){
                // Funcionando
                produto.cadastrarProduto();
                produtoController.cadastrarProdutos(produto);

            }else if(opcao == 2) {
                //Funcionando
                cliente.cadastrarCliente();
                clienteController.cadastrarClientes(cliente);

            }else if(opcao == 3){

                // Funcionando
                System.out.println("Informe o Id do produto");
                int idProduto = scanner.nextInt();
                produtoController.pesquisarProdutos(idProduto);

            }else if(opcao == 4){
                //Funcionando
                System.out.print("Informe o CPF do cliente: ");
                String cpfPesquisa = scanner.nextLine();
                clienteController.pesquisarClientes(cpfPesquisa);

            }else if(opcao == 5){
                //Funcionando
                System.out.print("Informe o CPF do cliente:");
                String cpfDeletar = scanner.nextLine();
                clienteController.deletarClientes(cpfDeletar);

            }else if(opcao == 6){
                // Funcionando
                System.out.print("Informe o Id do produto:");
                int idDeletar = scanner.nextInt();
                produtoController.deletarProduto(idDeletar);

            }else if(opcao == 7){
                continuar = false;

            }else{
                System.out.println("Opção invalida");
            }
        }
    }
}
