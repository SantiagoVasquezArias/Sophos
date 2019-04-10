
public class Automovil {
	
	String marca;
	int modelo;
	int precio;
	boolean estado = false;
	
	
	public void encender() {
		
		if(estado == true) 
		{
				System.out.println("El auto esta encendido.");
				
		}
		else 
		{
			System.out.println("El auto ha encendido.");
			estado = true;
			
		}
		
		
	}
	
	public void apagar() {
		
		if(estado == true) 
		{
				System.out.println("El auto se apago.");
				estado = false;
				
		}
		else 
		{
			System.out.println("El auto ya esta apagado.");
			
			
		}
		
	}
	
	public void  avanzar() {
		
		if(estado == true) 
		{
				System.out.println("El auto esta avanzando.");
				
		}
		else 
		{
			System.out.println("El auto no puede avanzar.");
			estado = true;
			
		}
		
		
	}
	
	

}
