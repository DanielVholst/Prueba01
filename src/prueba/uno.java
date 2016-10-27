package prueba;

import java.util.Scanner;

public class uno {
	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado=new Scanner(System.in);
int b,a,c,raiz;
double resultadoPos,resultadoNeg;
		System.out.println("Vamos a calcular una raiz de segundo grado respecto a su formula x=-b mas menos "
				+"raiz de b al cuadrado menos 4ac todo ello entre 2a");
		System.out.println("Introduce b");
		b=teclado.nextInt();
		System.out.println("Introduce a");
		a=teclado.nextInt();
		System.out.println("Introduce c");
		c=teclado.nextInt();
	raiz=(b*b)-(4*a*c);
	System.out.println(raiz);
	resultadoPos=(((-b)+Math.sqrt(raiz))/(2*a) );
	resultadoNeg=(((-b)-Math.sqrt(raiz))/(2*a) );
	System.out.println("El resultado de la suma es "+resultadoPos);
	System.out.println("El resultado de la resta es "+resultadoNeg);
	

	}

}
