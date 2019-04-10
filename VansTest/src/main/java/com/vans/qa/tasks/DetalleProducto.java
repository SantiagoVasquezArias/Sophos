package com.vans.qa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.vans.qa.models.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static com.vans.qa.userinterfaces.VansSeleccionProducto.seleccionTalla;
import static com.vans.qa.userinterfaces.VansSeleccionProducto.seleccionCantidad;;

public class DetalleProducto implements Task {

	private String size;
	private String quantity;

	public DetalleProducto(Producto producto) {
		this.size = producto.getSize();
		this.quantity = producto.getQuantity();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Check.whether(seleccionTalla.resolveFor(actor).waitUntilVisible().isVisible())
				.andIfSo(SelectFromOptions.byValue(size).from(seleccionTalla))
				,
				Check.whether(seleccionTalla.resolveFor(actor).waitUntilVisible().isVisible())
				.andIfSo(SelectFromOptions.byValue(quantity).from(seleccionCantidad)));
				
				//SelectFromOptions.byValue(size).from(seleccionTalla));
				//SelectFromOptions.byValue(quantity).from(seleccionCantidad));
	}
	
	/**
	 * Detalle del producto en tiempo de ejecución.
	 * @param producto seleccionado los detalles del producto al momento de ejecutar el metodo.
	 * @return la ejecucion de la clase DetalleProducto en tiempo de ejecución.
	 */
	
	public static DetalleProducto conElDetalleSeleccionado(Producto producto) {

		return instrumented(DetalleProducto.class, producto);

	}

}
