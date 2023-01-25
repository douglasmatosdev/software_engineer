package massacorporal;

import java.util.Scanner;

public class MassaCorporal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.print("Informe um peso: ");
		peso = Double.parseDouble(sc.nextLine());
		
		System.out.print("Informe uma altura: ");
		altura = Double.parseDouble(sc.nextLine());
		
		imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f", imc);
		
		sc.close();
	}

}
