import java.util.Scanner;

public class Ejercicio13 {

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero mayor que 1");
		num=entrada.nextInt();
		return num;
	}
	
	public static boolean validarNumero(int num) {
		boolean numValidado=false;
		if(num<=1) {
			numValidado=false;
		}else {
			numValidado=true;
		}
		return numValidado;
	}
	
	public static void mostraResultado(int num) {
		System.out.println("todos los numeros existentes entre " + "1" + " y " + num + " son:");
		for(int i = 1; i<=num;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
        int num;
        boolean numValidado;
        do{
            num = pedirNumero();
            numValidado = validarNumero(num);
            if  (!numValidado){
                System.out.println("Error. El número debe ser mayor que 1.");
            }
        }while(!numValidado);
        mostraResultado(num);
	}

}
