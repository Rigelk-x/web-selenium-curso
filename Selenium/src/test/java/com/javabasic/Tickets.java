package com.javabasic;

public class Tickets {
	
	int precioAdulto, edad;
	double precioNino, precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	//Constructor
	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante) {
		
		precioAdulto = precioNormal;
		precioNino = precioNormal * (.85);
		precioEstudiante = precioNormal * (.5);
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
		
		
	}
	
	public Tickets() {
		
	}
	
	// Metodos
	
	public void costoDia() {
				System.out.println("El costo del Ticket: "+ costo);
	}
	
	public void precioAdulto() {
		System.out.println("Ticket Adulto $: "+ precioAdulto);
		
	}
	
	public void precioNino() {
		System.out.println("Ticket Niño $: "+ precioNino);
		
	}
	
	public void precioEstudiante() {
		System.out.println("Ticket Estudiante $: "+ precioEstudiante);
		
	}
	
	public void verificarCostoTicket() {
		if (estudiante ==true) {
			System.out.println("Eres un Estudiante el precio del Ticket es: $" +precioEstudiante);
		}else if (edad>18) {
			System.out.println("Eres un Adulto el precio del Ticket es: $" +precioAdulto);
						
		}else {
			System.out.println("Eres un Niño el precio del Ticket es: $" +precioNino);
			
		}
	}
//sobrecarga metodos
	
	public double sumarTickets() {
		
		double suma = precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
	}
	
    public double sumarTickets(int descuento) {
		
		double suma = (precioAdulto + precioNino)- descuento;
		System.out.println(suma);
		return suma;
	}
	
	

	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tickets tickets = new Tickets (100, 19, true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		tickets.sumarTickets(85);
		
		

	}

}
