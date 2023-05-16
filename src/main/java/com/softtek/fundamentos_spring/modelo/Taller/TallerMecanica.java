package com.softtek.fundamentos_spring.modelo.Taller;

import org.springframework.stereotype.Component;

@Component
public class TallerMecanica implements  ITaller{

    @Override
    public String reparar(Coche coche) {
        return "Cambian bujias";
    }
}
