#include <iostream>

using namespace std;

void dobro(double numeros[], double numerosEmDobro[], int tamanho);

int main()
{

    int tamanho = 5;
    double numeros[tamanho], numerosEmDobro[tamanho];

    for (int i = 0; i < tamanho; i++)
    {
        cout << "\nNúmero " << i + 1 << ": ";
        cin >> numeros[i];
    }

    dobro(numeros, numerosEmDobro, tamanho);

    cout << "\nOriginal\tDobro\n";

    for (int i = 0; i < tamanho; i++)
    {
        cout << "\n"
             << numeros[i] << "\t\t" << numerosEmDobro[i];
    }

    cout << "\n\n";

    return 0;
}

void dobro(double numeros[], double numerosEmDobro[], int tamanho)
{
    for (int i = 0; i < tamanho; i++)
    {
        numerosEmDobro[i] = numeros[i] * 2;
    }
}