package com.softtek.fundamentos_spring.modelo.IDAO;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Desarrollo")
@Primary
public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Inserto en Desarrollo " + c1.toString();
    }
}
