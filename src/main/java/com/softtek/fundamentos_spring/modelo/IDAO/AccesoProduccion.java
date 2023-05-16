package com.softtek.fundamentos_spring.modelo.IDAO;

public class AccesoProduccion implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Insercción en Producción " + c1.toString();
    }
}
