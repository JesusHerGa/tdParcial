package com.HernandezServicios.ms.Operacion.service;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HernandezServicios.ms.Operacion.constans.mensajes;
import com.HernandezServicios.ms.Operacion.model.OperacionModel;
import com.HernandezServicios.ms.Operacion.repository.IOperacionRepository;



@Service
public class OperacionService  implements IOperacionService {
 
    private static final Logger logger = LoggerFactory.getLogger(OperacionService.class);
    
    @Autowired
    private IOperacionRepository operacionRepositoy;
 
    @SuppressWarnings("null")
    @Override
    public OperacionModel Registrar(OperacionModel operacionModel) {
        logger.info(mensajes.SRV_INICIO_REGISTRO);
        logger.debug(mensajes.SRV_DEBUG_DATOS, 
                operacionModel.getTipoOperacion(), 
                operacionModel.getIdCliente(), 
                operacionModel.getTotal());
        
        OperacionModel saved = operacionRepositoy.save(operacionModel);
        
        logger.info(mensajes.SRV_INFO_GUARDADO_OK, saved.getIdOperacion());
        logger.debug(mensajes.SRV_DEBUG_FIN);
        
        return saved;
    }

   
   
}
