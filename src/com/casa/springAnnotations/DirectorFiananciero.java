package com.casa.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DirectorFiananciero implements Empleados {

	// Campo de clase con la Interface para la inyeccion
	private InformeFinanciero informeFinanciero;
	
	
	@Autowired
	public DirectorFiananciero(InformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Tareas de puras weas :D";
	}

	@Override
	public String getInformes() {
		return informeFinanciero.getInformeFinanciero();
	}

}
