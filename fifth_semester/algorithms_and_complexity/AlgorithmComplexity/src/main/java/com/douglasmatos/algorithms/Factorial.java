package com.douglasmatos.algorithms;

public abstract class Factorial {
    public static int factorial(int n) {
        int result;

        if (n == 0 || n == 1)
            result = 1;
        else
            result = n * factorial(n - 1);

        return result;
    }
}
