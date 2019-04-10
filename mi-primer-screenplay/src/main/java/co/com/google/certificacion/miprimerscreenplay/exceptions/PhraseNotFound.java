package co.com.google.certificacion.miprimerscreenplay.exceptions;

public class PhraseNotFound extends AssertionError {
	
	public static final String fraseNoFunciona ="La frase encontrada no corresponde a la busqueda";
	
	public PhraseNotFound (String mensaje, Throwable cause) {
		super(mensaje,cause);
		
	}

}
