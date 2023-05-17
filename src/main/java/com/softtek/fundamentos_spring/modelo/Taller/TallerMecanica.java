package com.softtek.fundamentos_spring.modelo.Taller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("TMecanica")
@Primary
public class TallerMecanica implements  ITaller{

    @Override
    public String reparar(Coche coche) {
        return "Cambian bujias";
    }
}
