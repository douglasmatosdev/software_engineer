package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int divisor, dividendo, quociente = 0;
        String control = "s";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Entre com o dividendo.");
            dividendo = sc.nextInt();
            System.out.println("Entre com o divisor.");
            divisor = sc.nextInt();
            try {
                quociente = dividendo / divisor;
            }
            catch (Exception e){
                System.out.println("ERRO: Divisão por zero!");
            }
            System.out.println("O quociente é: " + quociente);
            System.out.println("Repetir?(s/n)");
            control = sc.next().toString();
        } while (control.equals("s"));

        sc.close();
    }
}
