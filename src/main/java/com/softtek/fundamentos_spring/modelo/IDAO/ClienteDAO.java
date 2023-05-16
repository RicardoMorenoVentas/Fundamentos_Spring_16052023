package com.softtek.fundamentos_spring.modelo.IDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO implements IDAO{

    @Autowired
    private IDAO conexion;

    public ClienteDAO(IDAO conexion){
        this.conexion = conexion;
    }
    @Override
    public String insertar(Cliente c1) {
        return "Inserto el cliente " + c1.toString();
    }
}
