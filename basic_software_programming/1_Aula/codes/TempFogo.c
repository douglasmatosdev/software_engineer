#include <stdio.h>

main()
{
    float temp = 80;
    float ajusteTemp = 70;
    int fogo = 100;
    int alarme = 0;
    int count = 0;

    while (count < 10)
    {
        printf("Verificando a temperatura...\nTemperatura \t Ajuste.Temp. \t fogo \t Alarme \n %.2f \t\t %.0f \t\t %d \t %d \n", temp, ajusteTemp, fogo, alarme);

        if (temp > ajusteTemp)
        {
            fogo = 10;
            alarme = 1;
        }
        else
        {
            fogo = 100;
            alarme = 0;
        }
        count++;

        printf("\n\n");
    }
}