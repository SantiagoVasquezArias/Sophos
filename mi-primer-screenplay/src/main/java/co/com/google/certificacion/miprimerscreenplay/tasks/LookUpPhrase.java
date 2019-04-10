package co.com.google.certificacion.miprimerscreenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.google.certificacion.miprimerscreenplay.models.Phrase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Enter;
import static co.com.google.certificacion.miprimerscreenplay.userinterfaces.GoogleHomePage.SEARCH_BAR;



public class LookUpPhrase implements Task{
	
	private String frase;
	
	public LookUpPhrase(String phrase) {
		this.frase = phrase;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(frase).into(SEARCH_BAR).thenHit(Keys.ENTER)
				
				);
		
	}
	
	public static LookUpPhrase composedOfTheWords(Phrase frase) {
		
		return instrumented(LookUpPhrase.class, frase.getCadenaUno() +" "+ frase.getCadenaDos());
			
	}
	

}
