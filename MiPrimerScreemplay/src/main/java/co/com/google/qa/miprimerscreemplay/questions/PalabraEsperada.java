package co.com.google.qa.miprimerscreemplay.questions;

import co.com.google.qa.miprimerscreemplay.userinterfaces.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


@Subject("validar resultado")
public class PalabraEsperada implements Question<String>  {
	
	public PalabraEsperada() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answeredBy(Actor actor) {
		
		return GoogleResultPage.barraDeBusqueda.resolveFor(actor).waitUntilClickable().getValue();
	}
	
	public static PalabraEsperada searched() {
		return new PalabraEsperada();
	}
}
