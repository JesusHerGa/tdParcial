package HernandezServicios.producto.mapper;

import HernandezServicios.producto.dto.ProductoResponse;
import HernandezServicios.producto.model.ProductoModel;

public final class ProductoMapper {

    private ProductoMapper() {
    }

    public static ProductoResponse toResponse(ProductoModel model) {
        if (model == null) {
            return null;
        }
        return ProductoResponse.builder()
                .idProducto(model.getIdProducto())
                .nombre(model.getNombre())
                .precio(model.getPrecio())
                .build();
    }
}
