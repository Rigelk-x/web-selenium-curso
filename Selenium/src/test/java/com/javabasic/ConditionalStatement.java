package com.javabasic;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 50;
    	int limiteVelocidad = 70;
    	//IF
//		
//		if(velocidad > limiteVelocdiad) {
//			system.out.println("Multa!!!");
//		}
//		// IF ELSE
//		if(velocidad > limiteVelocdiad) {
//			system.out.println("Multa!!!");
//		
//		}else {
//			system.out.println("Vamos a una velocidad adecuada!!!");
//		}
			
//       //IF ANIDADO
//    	boolean highway = true ;
//    	
//    	if(highway==true) {
//    		
//    		System.out.println("Vamos en la Highway!!!");
//    		
//    		limiteVelocidad =  100;
//    		
//    		if(velocidad > limiteVelocidad) {
//    			System.out.println("Multa!!!");
//   		
//    		}else {
//    			System.out.println("Vamos a una velocidad adecuada!!!");
//    		}
//    		
//	  }
    	
//        //IF ANIDADO
//     	boolean highway = false ;
//     	
//     	if(highway==true) {
//     		
//     		System.out.println("Vamos en la Highway!!!");
//     		
//     		limiteVelocidad =  100;
//     		
//     		if(velocidad > limiteVelocidad) {
//     			System.out.println("Multa!!!");
//    		
//     		}else {
//     			System.out.println("Vamos a una velocidad adecuada!!!");
//     		}
//     		
// 	  } else if (velocidad > limiteVelocidad){
// 		 System.out.println("Vas en una calle y a exceso de velocidad!!!");
// 		 
// 	  }else {
// 		 System.out.println("Vas en una calle y a una velocidad adecuada!!!");
// 	  }
    	
    	// SwITCH CASE
    	
    	int temperatura = 10;
    	
    	switch(temperatura) {
    	case 10:
    		System.out.println("frio");
    		break;
    		
    	case 20:
    		System.out.println("Agradable");
    		break;
    		
    	case 30:
    		System.out.println("Calor");
    		break;
    		
    	case 40:
    		System.out.println("Estamos en el Desierto");
    		break;
    		
    	default:
    		System.out.println("Da igual!!");
    		break;
    		
    	}
	}
}
