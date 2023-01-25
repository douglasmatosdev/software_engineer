#include <stdio.h>

// How to sort a heightsOrfPeople in ascending order in C language?
int main()
{
    system("clear");

    int index, amountOfPeople, indexMin, subIndex;

    printf("Informe a quantidade de pessoas: ");
    scanf("%d", &amountOfPeople); // Read amout people

    float heightsOrfPeople[amountOfPeople];

    // Read all heights
    printf("\nInforme as alturas das %d pessoas:\n", amountOfPeople);
    for (index = 0; index < amountOfPeople; index++)
    {
        printf("%d°. pessoa: ", index + 1);
        scanf("%f", &heightsOrfPeople[index]);
    }

    for (index = 0; index < amountOfPeople; index++)
    {
        indexMin = index;

        for (subIndex = index + 1; subIndex < amountOfPeople; subIndex++)
        {
            if (heightsOrfPeople[subIndex] < heightsOrfPeople[indexMin])
            {
                indexMin = subIndex;
            }
        }

        if (indexMin != index)
        {
            float tmp = heightsOrfPeople[indexMin];
            heightsOrfPeople[indexMin] = heightsOrfPeople[index];
            heightsOrfPeople[index] = tmp;
        }
    }

    printf("\n\nOrdeanndo alturas de forma crescente:\n");
    for (index = 0; index < amountOfPeople; index++)
    {
        printf("%d°. pessoa\t", index + 1);
    }
    printf("\n");
    for (index = 0; index < amountOfPeople; index++)
    {
        printf("%.2fm\t\t", heightsOrfPeople[index]);
    }

    printf("\n\n");

    printf("Menor altura\tMaior altura\n");
    printf("%.2f\t\t%.2f\n", heightsOrfPeople[0], heightsOrfPeople[amountOfPeople - 1]);

    return 0;
}
