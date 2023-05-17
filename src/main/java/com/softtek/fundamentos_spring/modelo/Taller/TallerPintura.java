package com.softtek.fundamentos_spring.modelo.Taller;

import org.springframework.stereotype.Component;

@Component("TPintura")
public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche coche) {
        return "Repintan el coche";
    }
}
