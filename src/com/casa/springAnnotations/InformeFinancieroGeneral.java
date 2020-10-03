package com.casa.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroGeneral implements InformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Esto es un informe financiero para perfiles Generales.";
	}

}
