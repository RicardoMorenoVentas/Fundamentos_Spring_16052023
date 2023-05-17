package com.softtek.fundamentos_spring.modelo.Coche;

import lombok.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class CocheCoche implements IVehiculo{
    private int deposito;

    public CocheCoche(){
        this.deposito = 100;
    }

    public CocheCoche(int deposito){
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        this.deposito--;
        return deposito > 0 ? "Se mueve" : "No se mueve";
    }

}
