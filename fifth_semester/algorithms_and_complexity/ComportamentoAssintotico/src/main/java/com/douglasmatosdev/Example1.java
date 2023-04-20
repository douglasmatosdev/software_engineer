package com.douglasmatosdev;

abstract class Example1 {
    public static void run() {
        int[] A = {5, 3, 2, 1, 4};
        int M = A[0];
        int n = A.length;
        System.out.print("Dos valores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+", ");
            if (A[i] >= M) {
                M = A[i];
            }
        }

        System.out.println("\nO maior número é " + M);
    }
}
