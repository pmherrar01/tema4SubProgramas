package Ejercicio3;
import java.util.Scanner;

import Mayor.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Introduce un numero");
		num1 = entrada.nextInt();
		System.out.println("Introduce un segundo numero");
		num2 = entrada1.nextInt();
		System.out.println("Introduce un ultimo numero");
		num3 = entrada2.nextInt();
		
		Mayor.Mayor(num1, num2, num3);
	}

}
