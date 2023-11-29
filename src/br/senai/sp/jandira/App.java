package br.senai.sp.jandira;

import br.senai.sp.jandira.controller.Menu;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        Menu menu = new Menu();
        try {
            menu.executarMenu();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
