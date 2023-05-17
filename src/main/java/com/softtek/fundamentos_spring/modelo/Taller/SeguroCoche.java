package com.softtek.fundamentos_spring.modelo.Taller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche implements ITaller{

    @Autowired
    private ITaller taller_aseguradora;

    private String n_aseguradora;

    public SeguroCoche(){
        this.taller_aseguradora = new TallerMecanica();
        this.n_aseguradora = "Axa";
    }

    public SeguroCoche(ITaller taller, String n_aseguradora){
        this.taller_aseguradora = taller;
        this.n_aseguradora = n_aseguradora;
    }

    public ITaller getTaller_aseguradora() {
        return taller_aseguradora;
    }

    public void setTaller_aseguradora(ITaller taller_aseguradora) {
        this.taller_aseguradora = taller_aseguradora;
    }

    public String getN_aseguradora() {
        return n_aseguradora;
    }

    public void setN_aseguradora(String n_aseguradora) {
        this.n_aseguradora = n_aseguradora;
    }

    @Override
    public String reparar(Coche coche) {
        return "Mando coche a taller " + this.taller_aseguradora.getClass().getSimpleName();
    }
}
