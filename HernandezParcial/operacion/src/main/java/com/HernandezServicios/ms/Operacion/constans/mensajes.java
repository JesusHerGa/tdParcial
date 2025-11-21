package com.HernandezServicios.ms.Operacion.constans;

public final class mensajes {

	private mensajes() {
	}

	// Controller
	public static final String CTRL_INICIO_REGISTRO = "Iniciando registro de operación";
	public static final String CTRL_DEBUG_DATOS = "Tipo de operación: {}, Cliente ID: {}, Total: {}";
	public static final String CTRL_DEBUG_ENVIO_SERVICIO = "Modelo creado, enviando a servicio para guardarlo";
	public static final String CTRL_INFO_REGISTRO_OK = "Operación registrada exitosamente con ID: {}";

	// Service
	public static final String SRV_INICIO_REGISTRO = "Iniciando proceso de registro en base de datos";
	public static final String SRV_DEBUG_DATOS = "Operación - Tipo: {}, Cliente ID: {}, Total: {}";
	public static final String SRV_INFO_GUARDADO_OK = "Operación guardada exitosamente en base de datos con ID: {}";
	public static final String SRV_DEBUG_FIN = "Operación completada";
}
