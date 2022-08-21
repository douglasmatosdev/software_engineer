#include <iostream>
#include <cmath>

using namespace std;

void arredonda(double valores[], int tam);

int main()
{

    int tam = 5;
    double notas[tam];

    for (int i = 0; i < tam; i++)
    {
        cout << "\nNota " << i + 1 << ": ";
        cin >> notas[i];
    }

    cout << "\n\nRelação das notas originais\n";

    for (int i = 0; i < tam; i++)
    {
        cout << notas[i] << "\t";
    }
    
    arredonda(notas, tam);

    cout << "\n\nRelação das notas arredondadas para cima\n";
    for (int i = 0; i < tam; i++)
    {
        cout << notas[i] << "\t";
    }

    cout << "\n\n";

    return 0;
}

void arredonda(double valores[], int tam)
{
    for (int i = 0; i < tam; i++)
    {
        valores[i] = ceil(valores[i]);
    }
}