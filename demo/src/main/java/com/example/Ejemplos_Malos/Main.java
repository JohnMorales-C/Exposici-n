package com.example.Ejemplos_Malos;

interface Machine {
    void print();
    void scan();
    void fax();
}

class BasicPrinter implements Machine {

    @Override
    public void print() {
        System.out.println("Imprimiendo documento...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException(
            "Esta impresora no puede escanear"
        );
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException(
            "Esta impresora no puede enviar fax"
        );
    }
}

public class Main {
    public static void main(String[] args) {

        BasicPrinter printer = new BasicPrinter();

        printer.print();

        try {
            printer.scan();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
