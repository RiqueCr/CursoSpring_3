package com.casa.springAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Con la java annotation @Component se indica que a partir de esta clase es posible
// crear beans. Y entre los parentesis va el nombre con el que vamos a solicitar un bean de esta clase
// Es lo mismo que el atributo id en las etiquetas bean
@Component//("Junior") No es necesario indicar un "id" del bean
@Scope(scopeName = "singleton") // Para indicar que tipo de patron de diseño deseamos utilizar
public class Junior implements Empleados {

	// Campo de Clase InformeFinanciero Interface
	@Autowired
	@Qualifier("informeFinancieroJunior")
	private InformeFinanciero informeFinanciero;
	/*
	 *	Anotación @Qualifier es para especificar desde qué clase que implemente la interface
	 *	necesitamos que se realice la inyeccion de dependencia
	 *	Esto es util cuando multiples clases implementan la misma interface 
	 */
	
	// Autowired lo que hace es buscar una clase que implemente la interface que se esta inyectando
	// entonces ese objeto de la interface va a acceder al metodo de la clase que implementa la interface
	// accediendo a la logica especifica
//	@Autowired
//	public Junior(InformeFinanciero informeFinanciero) {
//		this.informeFinanciero = informeFinanciero;
//	}
	
	@Override
	public String getTareas() {
		return "Tarea de Junior: Explotación Laboral a bajo coste.";
	}

	@Override
	public String getInformes() {
//		return "Informe de Junior: Informe con faltas de ortografía y falta de metodología."
		return informeFinanciero.getInformeFinanciero();
	}

//	@Autowired
//	public void setInformeFinanciero(InformeFinanciero informeFinanciero) {
//		this.informeFinanciero = informeFinanciero;
//	}
	
	/*
	 * Para utilizar estos metodos init() y destroy() se debe utilizar el patron singleton
	 * con prototype no funcionan
	 */	
	@PostConstruct // Anotacion para indicar que este es el metodo init()
	public void initJunior() {
		System.out.println("Metodo init() :D");	
	}
	
	@PreDestroy // Anotacion para indicar que este es el metodo destroy()
	public void destroyJunior() {
		System.out.println("Metodo destroy() :D");
	}
	
}
