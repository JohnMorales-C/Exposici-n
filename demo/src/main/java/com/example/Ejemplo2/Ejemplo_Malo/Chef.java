package com.example.Ejemplo2.Ejemplo_Malo;

import com.example.Ejemplo2.Ejemplo_Malo.Interface.RestaurantEmployee;

class Chef implements RestaurantEmployee {

    @Override
    public void cookFood() {
        System.out.println("El chef está cocinando.");
    }

    @Override
    public void serveCustomer() {
        throw new UnsupportedOperationException(
            "El chef no atiende clientes."
        );
    }

    @Override
    public void cleanTables() {
        throw new UnsupportedOperationException(
            "El chef no limpia mesas."
        );
    }

    @Override
    public void managePayments() {
        throw new UnsupportedOperationException(
            "El chef no maneja pagos."
        );
    }
}
