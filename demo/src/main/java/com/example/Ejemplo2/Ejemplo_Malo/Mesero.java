package com.example.Ejemplo2.Ejemplo_Malo;

import com.example.Ejemplo2.Ejemplo_Malo.Interface.RestaurantEmployee;

class Mesero implements RestaurantEmployee {

    @Override
    public void cookFood() {
        throw new UnsupportedOperationException(
            "El mesero no cocina."
        );
    }

    @Override
    public void serveCustomer() {
        System.out.println("El mesero está atendiendo clientes.");
    }

    @Override
    public void cleanTables() {
        System.out.println("El mesero está limpiando mesas.");
    }

    @Override
    public void managePayments() {
        throw new UnsupportedOperationException(
            "El mesero no administra pagos."
        );
    }
}
