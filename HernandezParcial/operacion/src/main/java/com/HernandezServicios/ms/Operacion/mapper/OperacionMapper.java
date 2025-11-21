package com.HernandezServicios.ms.Operacion.mapper;

import com.HernandezServicios.ms.Operacion.dto.OperacionRequest;
import com.HernandezServicios.ms.Operacion.dto.OperacionResponse;
import com.HernandezServicios.ms.Operacion.model.OperacionModel;

public final class OperacionMapper {

    private OperacionMapper() {
    }

    public static OperacionModel toModel(OperacionRequest request) {
        if (request == null) {
            return null;
        }
        return new OperacionModel(
                request.getTipoOperacion(),
                request.getIdCliente(),
                request.getTotal());
    }

    public static OperacionResponse toResponse(OperacionModel model) {
        if (model == null) {
            return null;
        }
        return OperacionResponse.builder()
                .idOperacion(model.getIdOperacion())
                .idCliente(model.getIdCliente())
                .tipoOperacion(model.getTipoOperacion())
                .total(model.getTotal())
                .build();
    }
}
