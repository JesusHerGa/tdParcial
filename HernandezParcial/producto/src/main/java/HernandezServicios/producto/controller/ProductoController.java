package HernandezServicios.producto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HernandezServicios.producto.constans.ApiRoutes;
import HernandezServicios.producto.dto.ActualizarPrecioRequest;
import HernandezServicios.producto.dto.ProductoResponse;
import HernandezServicios.producto.service.IProductoService;

@RestController
@RequestMapping(ApiRoutes.Producto.BASE)
public class ProductoController {

    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    private final IProductoService productoService;

    public ProductoController(IProductoService productoService) {
        this.productoService = productoService;
    }

    @PutMapping(ApiRoutes.Producto.ACTUALIZAR_PRECIO)
    public ResponseEntity<ProductoResponse> actualizarPrecio(@Validated @RequestBody ActualizarPrecioRequest request) {
        logger.info("[ProductoController][PUT][ActualizarPrecio] → Solicitud recibida para id {}", request.getIdProducto());
        ProductoResponse response = productoService.actualizarPrecio(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
