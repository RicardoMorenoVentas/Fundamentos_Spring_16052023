package com.softtek.fundamentos_spring.modelo.IDAO;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
    private String nombre;
    private String NIF;

    public Cliente(){
        this.nombre = "Joe Doe";
        this.NIF = "12345678X";
    }

    public Cliente(String nombre, String NIF){
        this.nombre = nombre;
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Cliente " +
                "con nombre='" + nombre + '\'' +
                ", NIF='" + NIF + '\'';
    }
}
