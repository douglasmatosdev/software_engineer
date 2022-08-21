#include <stdio.h>
#include <stdlib.h>

void main()
{
    int i, NUM[15];

    // Lendo os valores
    for (i = 0; i < 15; i++)
    {
        printf("Informe um numero: \n");
        scanf("%d", &NUM[i]);
    }

    // Imprimindo valores
    for (i = 0; i < 15; i++)
    {
        printf("Numero: %d \n", NUM[i]);
    }
}