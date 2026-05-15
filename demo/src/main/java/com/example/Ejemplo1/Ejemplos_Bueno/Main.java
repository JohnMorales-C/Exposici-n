package com.example.Ejemplo1.Ejemplos_Bueno;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class BasicPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Imprimiendo documento...");
    }
}

class MultiFunctionPrinter implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void scan() {
        System.out.println("Escaneando...");
    }

    @Override
    public void fax() {
        System.out.println("Enviando fax...");
    }
}

public class Main {

    public static void main(String[] args) {

        BasicPrinter basic = new BasicPrinter();
        basic.print();

        MultiFunctionPrinter multi = new MultiFunctionPrinter();

        multi.print();
        multi.scan();
        multi.fax();
    }
}
