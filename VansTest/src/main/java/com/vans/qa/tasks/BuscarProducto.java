package com.vans.qa.tasks;


import org.openqa.selenium.Keys;

import com.vans.qa.utils.ConexionRed;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static com.vans.qa.userinterfaces.VansHomePageBusqueda.barraDeBusqueda;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task{
	

	
private String producto;
	
	public BuscarProducto(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		ConexionRed.ConexionRed();
		
		actor.attemptsTo(
				Enter.theValue(producto).into(barraDeBusqueda).thenHit(Keys.ENTER));				
		
	} 
	
	/** 
	 * Busca el producto en tiempo de ejecución.
	 * @param producto seleccionado al momento de ejecutar el metodo.
	 * @return la ejecucion de la clase BuscarProducto en tiempo de ejecución.
	 */
	 
	
public static BuscarProducto conElNombre(String producto) {
		
		return instrumented(BuscarProducto.class, producto);

		}
}
