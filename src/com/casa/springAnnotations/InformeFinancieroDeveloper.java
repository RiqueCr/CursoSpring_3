package com.casa.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroDeveloper implements InformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Esto es un informe financiero para perfiles Developer.";
	}

}
