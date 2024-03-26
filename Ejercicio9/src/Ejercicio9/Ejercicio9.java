package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.print("Introduce un numero: ");
		num = entrada.nextInt();
		return num;
	}

	public static void main(String[] args) {
		int num1, num2, num3;
		num1=pedirNumero();
		num2=pedirNumero();
		num3=pedirNumero();
		Menor.Menor(num1, num2, num3);

	}

}
