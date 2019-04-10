package com.vans.qa.questions;


import com.vans.qa.userinterfaces.VansResultSeleccionProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
	
	@Subject("validar detalle Producto")
	public class ResultadoDetalleProducto implements Question<String>  {

		@Override
		public String answeredBy(Actor actor) {
			return VansResultSeleccionProducto.validarDetalleProducto.resolveFor(actor).waitUntilVisible().getText();
		}
		
		public static ResultadoDetalleProducto resultadoDetalleProducto() {
			return new ResultadoDetalleProducto();
		}
	}



