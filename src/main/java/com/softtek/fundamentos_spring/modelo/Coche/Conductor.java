package com.softtek.fundamentos_spring.modelo.Coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Conductor {

    IVehiculo vehiculo;

    public Conductor(IVehiculo coche_e){
        this.vehiculo = coche_e;
    }

    public String conducir(){
        return this.vehiculo.moverse();
    }
}
