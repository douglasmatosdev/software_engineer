#include <iostream>

using namespace std;

double media(double n[], int tam);

int main()
{
    double notas[5];

    for (int x = 0; x < 5; x++)
    {
        cout << "Digite a nota " << x + 1 << ": ";
        cin >> notas[x];
    }

    cout << "\nRelação de notas originais\n";
    
    for (int x = 0; x < 5; x++)
    {
        cout << notas[x] << "\t";
    }
        cout << "\n\nMedia da turma: " << media(notas, 5) << "\n";
        cout << "\n\n";

    return 0;
}

double media(double n[], int tam)
{
    double soma = 0;

    for (int x = 0; x < tam; x++)
    {
        soma += n[x];
        return soma / tam;
    }
}