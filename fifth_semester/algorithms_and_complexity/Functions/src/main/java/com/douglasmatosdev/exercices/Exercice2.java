package com.douglasmatosdev.exercices;

public abstract class Exercice2 {
    private static final int[] list = new int[]{0, 1, 2, 3, 4, 5};
    private static final int n = list.length;

    public static void run() {
        System.out.println("Exercise 2");
        f(n);
        g(n);
        System.out.println();
    }

    private static void f(int n) {
        // f(n) = n + 4
        System.out.println("f(" + n + ") = " + n + " + 4");
        System.out.println("f(" + n + ") = " + (n + 4));
    }

    private static void g(int n) {
        // g(n) = n²
        System.out.println("g(" + n + ") = " + n + "²");
        System.out.println("g(" + n + ") = " + (n * n));
    }

}
