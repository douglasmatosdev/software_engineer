#include <iostream>

using namespace std;

struct exemplo
{
    int anoNascimento;
    char nome[31];
} aux, candidatos[] = {1986, "João Renato", 1962, "Maria Teresa"};

void imprimir(exemplo candidatos[]);

int main()
{

    cout << "\nAntes da comparação\n";
    imprimir(candidatos);

    if (candidatos[0].anoNascimento > candidatos[1].anoNascimento)
    {
        aux = candidatos[0];
        candidatos[0] = candidatos[1];
        candidatos[1] = aux;
    }

    cout << "\n\n\nDepois da comparação\n";
    imprimir(candidatos);

    return 0;
}

void imprimir(exemplo candidatos[])
{
    cout << "\n"
         << candidatos[0].anoNascimento << "\t" << candidatos[0].nome;
    cout << "\n"
         << candidatos[1].anoNascimento << "\t" << candidatos[1].nome;
}