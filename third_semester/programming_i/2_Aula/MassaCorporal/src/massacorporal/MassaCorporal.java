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
		
		System.out.printf("IMC: %.2f%n", imc);
		
		// Analisando o resultado do imc
		if (imc < 18.5) {
			System.out.println("--- Abaixo do peso ---");
		} else if (imc < 25) {
			System.out.println("--- peso normal ---");
		} else if (imc < 30) {
			System.out.println("--- Sobrepeso ---");
		} else if (imc < 35) {
			System.out.println("--- Obesidade grau I ---");
		} else if (imc < 40) {
			System.out.println("--- Obesidade grau II ---");
		} else {
			System.out.println("--- Obesidade grau III ---");
		}
		
		sc.close();
	}

}
