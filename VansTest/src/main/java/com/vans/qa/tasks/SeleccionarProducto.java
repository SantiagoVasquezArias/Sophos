package com.vans.qa.tasks;

import static com.vans.qa.userinterfaces.VansSeleccionProducto.seleccionProducto;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.vans.qa.models.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarProducto implements Task{



	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(seleccionProducto));
		
								
		
	} 
	
	/**
	 * Selecciona el producto en timepo de ejecución.
	 * @return la ejecucion de la clase SeleccionarProducto en tiempo de ejecución.
	 */
	
public static SeleccionarProducto conElProductoSeleccionado () {
		
		return instrumented(SeleccionarProducto.class);

		}
}
