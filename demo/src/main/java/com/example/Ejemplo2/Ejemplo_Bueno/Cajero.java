package com.example.Ejemplo2.Ejemplo_Bueno;
import com.example.Ejemplo2.Ejemplo_Bueno.Interfaces.Payment;

class Cajero implements Payment {

    @Override
    public void managePayments() {
        System.out.println("El cajero está procesando pagos.");
    }
}
