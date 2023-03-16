package com.douglasmatos;

import com.douglasmatos.algorithms.Factorial;
import com.douglasmatos.algorithms.LowerValue;
import com.douglasmatos.utils.Utils;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[]{1, 10, 0, 9, 3, 5, -2, 100};
        int max = maximoRec(A, A.length);
        System.out.println(max);


//        runSmallerExample();
//        runFactorial();
    }

    public static int maximoRec(int[] A, int n) {
        if (n == 1) {
            return A[0];
        } else {
            int x = maximoRec(A, n - 1);
            if (x > A[n - 1]) {
                return x;
            } else {
                return A[n - 1];
            }
        }
    }

    public static void runFactorial() {
        int n = 3;
        int factorial = Factorial.factorial(n);

        System.out.println("Factorial of " + n + " is " + factorial);
    }

    public static void runSmallerExample() {
        int[] A = new int[]{100, 99, 1, 200, 35, 0, -1, 65, -100, 13};
        int n = A.length;

        int smaller = LowerValue.calculateSmaller(A, n);

        System.out.println("In the list of integers [" + Utils.toString(A) + "], the smaller value is " + smaller);
    }

}