package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {
    Scanner scanner = new Scanner(System.in);
    private String nome, descricao, atributo;
    private int id = 0, quantidade;
    private double preco;

    public  void cadastrarProduto(){
        System.out.print("Produto: ");
        this.nome = scanner.nextLine();
        System.out.print("Descrição: ");
        this.descricao = scanner.nextLine();
        System.out.print("Atributo: ");
        this.atributo = scanner.nextLine();
        System.out.print("Quantidade: ");
        this.quantidade = scanner.nextInt();
        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();

        System.out.println("✓ Cadastro concuido");
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
