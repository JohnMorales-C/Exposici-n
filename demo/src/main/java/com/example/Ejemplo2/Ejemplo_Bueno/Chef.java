package com.example.Ejemplo2.Ejemplo_Bueno;
import com.example.Ejemplo2.Ejemplo_Bueno.Interfaces.Cook;
public class Chef implements Cook {

    @Override
    public void cookFood() {
        System.out.println("El chef está cocinando.");
    }
}
