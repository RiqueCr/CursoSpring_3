package com.casa.springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Con esta anotacion @Configuration indicamos que este será nuestro archivo de configuracion
// Así sustituimos el archivo aplicationContext.xml ahora todo se hace acá!!!
@Configuration
@ComponentScan("com.casa.springAnnotations") // Indicamos que package debe escanear spring para funcionar
public class EmpleadosConfig {

	// Definir bean para InformeFinancieroGenial
	@Bean
	public InformeFinanciero getInformeFinanciero() {
		return new InformeFinancieroGenial();
	}
	
	// Definir bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados getDirectorFinanciero() {
		return new DirectorFiananciero(getInformeFinanciero());
	}
}
