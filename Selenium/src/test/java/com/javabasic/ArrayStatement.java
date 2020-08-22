package com.javabasic;

public class ArrayStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String []nombres = new String[4];
//		
//		nombres[0] = "Ricardo";
//		nombres[1] = "Fer";
//		nombres[2] = "Paty";
//		nombres[3] = "Angie";
//		
//		System.out.println(nombres[3]);
		
		String [][]persona = new String[4][4];
		
		persona [0][0] = "Paty";
		persona [0][1] = "Senior";
		persona [1][0] = "Angie";
		persona [1][1] = "call";
		persona [2][0] = "Fer";
		persona [2][1] = "Rapi";
		persona [3][0] = "Neto";
		persona [3][1] = "Tester";
		
		getNombreRol(persona);
		

	
}


      public static void getNombreRol (String [][]persona) {
    	  
    	  System.out.println("El nombre es "+persona[2][0]+" y su rol es: "+ persona[2][1]);
      }
}
      


