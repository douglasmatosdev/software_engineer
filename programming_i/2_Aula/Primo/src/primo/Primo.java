package primo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, i, contador = 0;
		
		System.out.print("Número..:");
		numero = Integer.parseInt(sc.nextLine());
		
		for (i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		
		if (contador == 2) {
			System.out.println("--- O número é PRIMO ---");
		} else {
			System.out.println("--- O número NÃO é primo ---");
		}
		
		sc.close();
	}

}
