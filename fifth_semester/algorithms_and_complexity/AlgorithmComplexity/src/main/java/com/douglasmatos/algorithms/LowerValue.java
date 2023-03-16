/**
 * A função de complexidade de tempo T(n) é o número de comparações entre os elementos de A,
 * visto que, para econtrar o menor elemento do vetor, é preciso mostrar que cada um dos n -1
 * elementos é menor que algum outro, e para isso gasta-se pelo menos n -1 comparações. Logo T(n) = n -1.
 *
 * O tempo de execução depende do tamanho de entrada, no caso deste exemplo o tempo é constante.
 */

package com.douglasmatos.algorithms;

public abstract class LowerValue {

    /**
     * @param A list of integers
     * @param n length of list
     * @return int smaller value
     */
    public static int calculateSmaller(int[] A, int n) {
        int i, smaller;

        smaller = A[0];
        for (i = 1; i < n; i++) {
            if (A[i] < smaller)
                smaller = A[i];
        }

        return smaller;
    }
}
