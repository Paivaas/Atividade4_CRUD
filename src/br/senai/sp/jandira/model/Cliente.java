package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);
    private String nome, cpf, email;
    private int id = 0;

    public  void cadastrarCliente(){
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();
        System.out.print("CPF: ");
        this.cpf = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();

        System.out.println("✓ Cadastro concuido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
