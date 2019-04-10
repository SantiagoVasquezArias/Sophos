package com.vans.qa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.vans.qa.userinterfaces.VansAgregarProducto.agregarProductoCompra;
import static com.vans.qa.userinterfaces.VansAgregarProducto.ProductoCompra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class AgregaProducto implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				Click.on(agregarProductoCompra),				
				Click.on(ProductoCompra)
				);
		
		
	}
	
	/** 
	 * Agrega el producto al carrito de compras en tiempo de ejecución
	 * @return la ejecucion de la clase AgregaProducto en tiempo de ejecución
	 */
	
public static AgregaProducto conElProductoAgregado () {
		
		return instrumented(AgregaProducto.class);

		}

}
