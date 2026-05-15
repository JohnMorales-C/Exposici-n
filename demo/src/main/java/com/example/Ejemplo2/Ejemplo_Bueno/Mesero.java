package com.example.Ejemplo2.Ejemplo_Bueno;
import com.example.Ejemplo2.Ejemplo_Bueno.Interfaces.Clean;
import com.example.Ejemplo2.Ejemplo_Bueno.Interfaces.Serve;

public class Mesero implements Serve, Clean {

    @Override
    public void serveCustomer() {
        System.out.println("El mesero está atendiendo clientes.");
    }

    @Override
    public void cleanTables() {
        System.out.println("El mesero está limpiando mesas.");
    }
}
