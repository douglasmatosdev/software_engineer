import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int divisor, dividendo, quociente = 0;

        String controle = "s";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Entre com o dividendo");
            dividendo = sc.nextInt();

            System.out.println("Entre com o divisor");
            divisor = sc.nextInt();

            quociente = dividendo / divisor;

            System.out.println("O queciente é: " + quociente);

            System.out.println("Repetir?");

            controle = sc.next().toString();

        }while(controle.equals("s"));

        sc.close();
    }
}
