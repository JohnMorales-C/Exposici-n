package com.example.Ejemplo2.Ejemplo_Bueno;

public class Main {

    public static void main(String[] args) {

        Chef chef1 = new Chef();
        Mesero Mesero1 = new Mesero();
        Cajero Cajero1 = new Cajero ();

        chef1.cookFood();

        Mesero1.serveCustomer();
        Mesero1.cleanTables();

        Cajero1.managePayments();
    }
}
