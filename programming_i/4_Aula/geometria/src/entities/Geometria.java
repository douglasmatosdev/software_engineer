package entities;

import java.util.Scanner;

public class Geometria {
    String forma;
    Double baseMenor;
    Double baseMaior;
    Double altura;

    public Geometria() {
    }

    public Geometria(String forma, Double baseMenor, Double baseMaior, Double altura) {
        this.forma = forma;
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        if (!forma.isEmpty()) {
            this.forma = forma;
        }
    }

    public Double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(Double baseMenor) {
        if (baseMenor > 0) {
            this.baseMenor = baseMenor;
        }
    }

    public Double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(Double baseMaior) {
        if (baseMaior > 0) {
            this.baseMaior = baseMaior;
        }
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void entradaDeDadosQuadrado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Forma...:");
        setForma(entrada.nextLine());
        System.out.println("Lado...:");
        setBaseMenor(Double.parseDouble(entrada.nextLine()));
    }

    public void imprimirQuadrado() {
        System.out.println("Forma..:" + getForma());
        System.out.println("Lado..:" + getBaseMenor());
        System.out.println("Area..:" + area(getBaseMenor()));
    }

    // Área do quadrado
    public double area(double baseMenor) {
        double area;
        area = baseMenor * baseMenor;
        return area;
    }

    public void entradaDeDadosTrapezio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Forma...:");
        setForma(entrada.nextLine());
        System.out.println("Lado menor...:");
        setBaseMenor(Double.parseDouble(entrada.nextLine()));
        System.out.println("Lado maior...:");
        setBaseMaior(Double.parseDouble(entrada.nextLine()));
        System.out.println("Altura...:");
        setAltura(Double.parseDouble(entrada.nextLine()));
    }

    public void imprimirTrapezio() {
        System.out.println("Forma..:" + getForma());
        System.out.println("Lado menor..:" + getBaseMenor());
        System.out.println("Lado maior..:" + getBaseMaior());
        System.out.println("Altura..:" + getAltura());
        System.out.println("Area..:" + area(getBaseMaior(), getBaseMenor(), getAltura()));
    }

    // Área do trapézio
    public double area(double baseMaior, double baseMenor, double altura) {
        double area;
        area = ((baseMaior + baseMenor) * altura) / 2;
        return area;
    }

    public void entradaDeDadosRetangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Forma...:");
        setForma(entrada.nextLine());
        System.out.println("Lado...:");
        setBaseMenor(Double.parseDouble(entrada.nextLine()));
        System.out.println("Altura...:");
        setAltura(Double.parseDouble(entrada.nextLine()));
    }

    public void imprimirRetangulo() {
        System.out.println("Forma..:" + getForma());
        System.out.println("Lado..:" + getBaseMenor());
        System.out.println("Altura..:" + getAltura());
        System.out.println("Area..:" + area(getBaseMenor(), getAltura()));
    }

    // Área do retângulo
    public double area(double baseMenor, double altura) {
        double area;
        area = baseMenor * altura;
        return area;
    }


}
