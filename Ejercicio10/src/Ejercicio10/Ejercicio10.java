package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.print("Introduce un numero: ");
		num = entrada.nextInt();
		return num;
	}
	
	public static void tabla(int num) {
		int i, resultado;
		for(i=0;i<=10;i++) {
			resultado = num*i;
			System.out.println(num + "X" + i + " = " + resultado);
		}
	}
	
	public static void main(String[] args) {
		int num=pedirNumero();
		tabla(num);

	}

}
