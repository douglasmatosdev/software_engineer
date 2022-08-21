#include <iostream>

using namespace std;

int main()
{

    char vetor[] = {'M', 'C'}, aux;

    cout << "\nAntes da Comparação\n";
    cout << "\n"
         << vetor[0] << "\t" << vetor[1];
    if (vetor[0] > vetor[1])
    {
        aux = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = aux;
    }

    cout << "\n\nApós a Comparação\n";
    cout << "\n"
         << vetor[0] << "\t" << vetor[1];
    cout << "\n\n";

    return 0;
}