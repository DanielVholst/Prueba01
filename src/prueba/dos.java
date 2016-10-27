package prueba;

import java.util.Scanner;

public class dos {
	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado=new Scanner(System.in);
		int z ;

		System.out.println("Introduce una letra y te dire si es una mayuscula :)");
		z=teclado.next().charAt(0); 
	
	if(z<=90 && z>=65){
		System.out.println("Si, eso es una mayuscula");
	}
	else{
		System.out.println("No, eso no es una mayuscula");
	}

	}

}
