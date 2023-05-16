package com.softtek.fundamentos_spring.modelo.Taller;

public class Coche {

    private String matricula;
    private String modelo;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Coche(String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public Coche(){
        this.matricula = "12345678K";
        this.modelo = "Toyota Prius";
    }
}
