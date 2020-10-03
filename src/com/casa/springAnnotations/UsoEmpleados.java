package com.casa.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String []args) {
		
		// 1. Leer el archivo xml de configuracion y crear un objeto que apunte a ese xml
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		// 1. Leer clase de configuracion que reemplaza el xml
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// 2. Solicitar un bean al contenedor (el xml)
		Empleados junior = contexto.getBean("junior", Empleados.class);
		
		// 3. Utilizar el bean
		System.out.println(junior.getTareas());
		System.out.println(junior.getInformes());
		
		// 4. Cerrar el contexto
		contexto.close();
		
	}
	
}
