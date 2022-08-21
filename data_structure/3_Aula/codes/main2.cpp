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
    

    pontoA.x = 10;
    pontoA.y = 20;
    pontoA.z = 50;

    pontoB.x = 10;
    pontoB.y = 20;
    pontoB.z = 50;

    imprimirDados(pontoA, 'A');
    imprimirDados(pontoB, 'B');

    return 0;
}


void imprimirDados(Coordenada ponto, char label) {
    cout << "Ponto " << label << " - x: " << ponto.x << endl;
    cout << "Ponto " << label << " - y: " << ponto.y << endl;
    cout << "Ponto " << label << " - z: " << ponto.z << endl << endl;
}