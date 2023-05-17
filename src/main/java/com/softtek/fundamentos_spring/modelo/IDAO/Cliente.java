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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Cliente " +
                "con nombre '" + nombre + '\'' +
                ", NIF '" + NIF + '\'';
    }
}
