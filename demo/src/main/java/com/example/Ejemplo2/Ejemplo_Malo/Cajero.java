package com.example.Ejemplo2.Ejemplo_Malo;
import com.example.Ejemplo2.Ejemplo_Malo.Interface.RestaurantEmployee;

class Cajero implements RestaurantEmployee {

    @Override
    public void cookFood() {
        throw new UnsupportedOperationException(
            "El cajero no cocina."
        );
    }

    @Override
    public void serveCustomer() {
        throw new UnsupportedOperationException(
            "El cajero no atiende mesas."
        );
    }

    @Override
    public void cleanTables() {
        throw new UnsupportedOperationException(
            "El cajero no limpia mesas."
        );
    }

    @Override
    public void managePayments() {
        System.out.println("El cajero está procesando pagos.");
    }
}
