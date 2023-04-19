package com.douglasmatosdev.exercices;

public abstract class Exercice1 {
    private static final int[] domain = new int[]{-3, -2, -1, 0, 1, 2, 3, 4};

    public static void run() {
        System.out.println("Exercise 1");
        for (int i = 0; i < domain.length; i++) {
            int image = 5 * domain[i] + 2;
            System.out.println(String.format("%3d %s %3d %s %3d %s %3d", domain[i], " --> f(", domain[i], ") = 5 (", domain[i], ") + 2 =", image));
        }
        System.out.println();
    }
}
