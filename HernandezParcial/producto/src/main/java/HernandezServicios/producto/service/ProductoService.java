package HernandezServicios.producto.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import HernandezServicios.producto.dto.ActualizarPrecioRequest;
import HernandezServicios.producto.dto.ProductoResponse;
import HernandezServicios.producto.exception.ResourceNotFoundException;
import HernandezServicios.producto.mapper.ProductoMapper;
import HernandezServicios.producto.model.ProductoModel;
import HernandezServicios.producto.repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService {

    private static final Logger logger = LoggerFactory.getLogger(ProductoService.class);

    private final IProductoRepository productoRepository;

    public ProductoService(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    @Transactional
    public ProductoResponse actualizarPrecio(ActualizarPrecioRequest request) {
        logger.info("[ProductoService][Actualizar] → Solicitado cambio de precio para id {}", request.getIdProducto());
        ProductoModel producto = productoRepository.findById(request.getIdProducto())
                .orElseThrow(() -> new ResourceNotFoundException("El producto no existe"));

        producto.setPrecio(request.getNuevoPrecio());
        ProductoModel actualizado = productoRepository.save(producto);
        logger.info("[ProductoService][Actualizar][SUCCESS] → Precio actualizado para {}", producto.getIdProducto());
        return ProductoMapper.toResponse(actualizado);
    }
}
