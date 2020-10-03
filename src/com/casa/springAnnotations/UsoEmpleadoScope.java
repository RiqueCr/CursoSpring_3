package com.casa.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleadoScope {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		Empleados bean_01 = contexto.getBean("junior", Empleados.class);
		Empleados bean_02 = contexto.getBean("junior", Empleados.class);
		
		System.out.println("HashCode Bean 01: " + bean_01.hashCode());
		System.out.println("HashCode Bean 01: " + bean_02.hashCode());
		
		if(bean_01.hashCode() == bean_02.hashCode()) {
			System.out.println("Utilizando Scope Singleton");
		}else {
			System.out.println("Utilizando Scope Prototype");
		}
		
		contexto.close();
	}

}
