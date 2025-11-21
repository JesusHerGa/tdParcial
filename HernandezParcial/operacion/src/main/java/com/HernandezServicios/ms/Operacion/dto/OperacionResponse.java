package com.HernandezServicios.ms.Operacion.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperacionResponse implements Serializable {

    private String idOperacion;
    private Integer idCliente;
    private String tipoOperacion;
    private double total;
}
