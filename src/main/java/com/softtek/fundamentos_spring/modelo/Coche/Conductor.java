package com.softtek.fundamentos_spring.modelo.Coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {

    @Autowired
    IVehiculo vehiculo;

    public Conductor(IVehiculo coche_e){
        this.vehiculo = coche_e;
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String conducir(){
        return this.vehiculo.moverse();
    }
}
