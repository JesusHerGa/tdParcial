package HernandezServicios.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HernandezServicios.producto.model.ProductoModel;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoModel, Long> {
}
