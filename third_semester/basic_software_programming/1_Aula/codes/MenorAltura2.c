#include <stdio.h>

int main()
{

    int i, elem;
    float maior, menor, n;

    printf("Entre com o total de alturas: \n");
    scanf("%d", &elem);

    maior = 0;
    menor = 3;

    printf("\n");
    for (i = 1; i <= elem; i++)
    {
        printf("Entre com uma altura\n");
        scanf("%f", &n);

        if (n > maior)
        {
            maior = n;
        }

        if (n < menor)
        {
            menor = n;
        }
    }

    printf("\n");
    printf("A maior altura eh %.2f\n", maior);
    printf("A menor altura eh %.2f\n", menor);

    return 0;
}
