package com.casa.springAnnotations;

public interface Empleados {

	/**
	 * Metodo que devuelve una tarea realizada por el Empleado
	 * Cada clase que implemente esta interface debe crear la logica 
	 * propia para su contexto de empleado
	 * @return String Con la tarea que realiza
	 */
	public String getTareas();
	
	/**
	 * Metodo que devuelve un informe realizada por el Empleado
	 * Cada clase que implemente esta interface debe crear la logica 
	 * propia para su contexto de empleado
	 * @return String Con el informe que realiza
	 */
	public String getInformes();
	
}
