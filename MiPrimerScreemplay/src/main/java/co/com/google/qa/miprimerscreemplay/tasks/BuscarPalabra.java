package co.com.google.qa.miprimerscreemplay.tasks;

import static co.com.google.qa.miprimerscreemplay.userinterfaces.GoogleHomePage.barraDeBusqueda;
//import static co.com.google.qa.miprimerscreemplay.userinterfaces.GoogleHomePage.botonBusqueda;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarPalabra implements Task{
	
private String palabra;
	
	public BuscarPalabra(String palabra) {
		this.palabra = palabra;
	}

	//en este metodo el actor intenta hacer la tarea 
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(palabra).into(barraDeBusqueda).thenHit(Keys.ENTER)
				//Click.on(botonBusqueda)
				);		
	} 
	
public static BuscarPalabra composedOfTheWords(String palabraUno, String palabraDos) {
		
		return instrumented(BuscarPalabra.class, palabraUno +" "+ palabraDos);

	}
}
