/**
 *
 * Dado um array `V` de tamanho `n`, procurar o menor
 * valor (posição `me`) colocar na primeira posição.
 * Repetir processo para a segunda posição, depois para a terceira etc.
 * Parar quando o array estiver ordenado.
 */

#include <stdio.h>

void selectionSort(int *V, int n);

int main() {
    int index = 0;
    int vector[5] = {3, 5, 1, 34, 0};

    printf("BEFORE: ");
    for (index = 0; index < 5; index++) {
        printf("%d,", vector[index]);
    }

    selectionSort(vector, 5);

    printf("\nAFTER: ");
    for (index = 0; index < 5; index++) {
        printf("%d,", vector[index]);
    }
    return 0;
}

/**
 *  Temos dois comandos de laço
 *  Laço externo: executando "n" vezes
 *  Laço interno: número de execuções depende
 *  do valor do índice do laço externo (n-1, n-2, n-3, ..., 2, 1)
 */
void selectionSort(int *V, int n) {
    int i, j, me, troca;
    for (i = 0; i < n - 1; i++) {
        me = i;
        for (j = i + 1; j < n; j++) {
            if (V[j] < V[me]) {
                me = j;
            }
        }
        if (i != me) {
            troca = V[i];
            V[i] = V[me];
            V[me] = troca;
        }
    }
}
