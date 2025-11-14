package com.HernandezServicios.ms.Operacion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HernandezServicios.ms.Operacion.constans.ApiRoutes;
import com.HernandezServicios.ms.Operacion.dto.OperacionRequest;
import com.HernandezServicios.ms.Operacion.model.OperacionModel;
import com.HernandezServicios.ms.Operacion.service.IOperacionService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(ApiRoutes.Operacion.BASE)
@Tag(name = "Operacion", description = "API para gestionar operaciones")
public class OperacionController {

        @Autowired
        IOperacionService operacionServicec;

        Logger logger = LoggerFactory.getLogger(OperacionController.class);

        @PostMapping(ApiRoutes.Operacion.REGISTRAR)
        public ResponseEntity<?> registrar(@RequestBody OperacionRequest request) {
                logger.info("Iniciando registro de operación");
                logger.debug("Tipo de operación: {}, Cliente ID: {}, Total: {}", 
                        request.getTipoOperacion(), request.getIdCliente(), request.getTotal());
                
                OperacionModel model = new OperacionModel(
                                request.getTipoOperacion(),
                                request.getIdCliente(),
                                request.getTotal());
                
                logger.debug("Modelo creado, enviando a servicio para guardarlo");
                model = operacionServicec.Registrar(model);
                
                logger.info("Operación registrada exitosamente con ID: {}", model.getIdOperacion());
                return new ResponseEntity<>(model, HttpStatus.CREATED);
        }

}
