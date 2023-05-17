package com.softtek.fundamentos_spring.modelo.Taller;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Coche {

    private String matricula;
    private String modelo;

}
