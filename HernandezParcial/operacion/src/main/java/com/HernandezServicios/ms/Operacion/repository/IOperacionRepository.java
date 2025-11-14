package com.HernandezServicios.ms.Operacion.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HernandezServicios.ms.Operacion.model.OperacionModel;

 
@Repository
public interface IOperacionRepository extends CrudRepository<OperacionModel, String>{
   
}

