#include <iostream>
#include <locale.h>
#include <stdlib.h>
#include <string>

using namespace std;

struct Coordenada
{
    int x, y, z;
};

void imprimirDados(Coordenada ponto, char label);

int main()
{
    setlocale(LC_ALL, "Portuguese");

    Coordenada pontoA;
    Coordenada pontoB;
    Coordenada pontoC;

    pontoA.x = 10;
    pontoA.y = 20;
    pontoA.z = 50;

    cout << "Agora defina os valores x, y e z para o Ponto A \n";

    cout << "Ponto A - x: ";
    cin >> pontoA.x;
    cout << "Ponto A - y: ";
    cin >> pontoA.y;
    cout << "Ponto A - z: ";
    cin >> pontoA.z;

    imprimirDados(pontoA, 'A');

    return 0;
}

void imprimirDados(Coordenada ponto, char label)
{
    cout << "Ponto " << label << " - x: " << ponto.x << endl
         << endl;
    cout << "Ponto " << label << " - y: " << ponto.y << endl;
    cout << "Ponto " << label << " - z: " << ponto.z << endl
         << endl;
}
