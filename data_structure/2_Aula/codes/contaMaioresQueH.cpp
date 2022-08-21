#include <iostream>

using namespace std;

int contaMaioresQueH(double alturas[], int tam, double altP);

int main()
{
    double alturas[4], alturaMinima;

    // Lendo alturas
    for (int i = 0; i < 4; i++)
    {
        cout << "\nAltura " << i + 1 << ": ";
        cin >> alturas[i];
    }

    cout << "\n\nQual a altura mínima? ";
    cin >> alturaMinima;
    cout << "\nRelação das alturas\n";

    for (int i = 0; i < 4; i++)
    {
        cout << alturas[i] << "\t";
    }

    contaMaioresQueH(alturas, 4, alturaMinima);
    cout << "\n\nTotal das alturas maiores que " << alturaMinima << ": " << contaMaioresQueH(alturas, 4, alturaMinima);
    cout << "\n\n";

    return 0;
}

int contaMaioresQueH(double alturas[], int tam, double altP)
{
    int conta = 0;

    for (int i = 0; i < tam; i++)
    {
        if (alturas[i] > altP)
        {
            conta++;
        }
    }
    return conta;
}