package com.vans.qa.questions;




import com.vans.qa.userinterfaces.VansResultPageBusqueda;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("validar resultado")
public class ResultadoBusqueda implements Question<String>  {

	@Override
	public String answeredBy(Actor actor) {
		return VansResultPageBusqueda.resultadoDeBusqueda.resolveFor(actor).waitUntilVisible().getText();
	}
	
	public static ResultadoBusqueda resultadoBusqueda() {
		return new ResultadoBusqueda();
	}

}
