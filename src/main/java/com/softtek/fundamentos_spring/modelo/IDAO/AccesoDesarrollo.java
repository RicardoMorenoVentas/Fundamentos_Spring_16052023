package com.softtek.fundamentos_spring.modelo.IDAO;

import org.springframework.stereotype.Component;

@Component
public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Inserto en Desarrollo " + c1.toString();
    }
}
