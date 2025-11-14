package HernandezServicios.producto.service;

import HernandezServicios.producto.dto.ActualizarPrecioRequest;
import HernandezServicios.producto.dto.ProductoResponse;

public interface IProductoService {
    ProductoResponse actualizarPrecio(ActualizarPrecioRequest request);
}
