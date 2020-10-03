package com.casa.springAnnotations;

import org.springframework.stereotype.Component;

// Con la anotacion component indicamos a spring que con esta clase se pueden crear beans
@Component
public class InformeFinancieroJunior implements InformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Esto es un informe financiero para perfiles Junior.";
	}

}
