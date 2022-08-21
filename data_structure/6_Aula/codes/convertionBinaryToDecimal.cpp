#include <iostream>
#include <stdlib.h>

#define TAM 40
#define LIMIT 214483520

using namespace std;

void empilha(int p[], int &t, int v);
int desempilha(int p[], int &t, int v);

int main()
{
    float n;                                      // para possibilitar a entrada de número maior do que o inteiro permite
    int num, resto, pilha[TAM], sinal, topo = -1; // inicilalização da pilha através do topo -1

    cout << "\n#########################################################";
    cout << "\n###                                                   ###";
    cout << "\n### Converte número da base decimal para base binária ###";
    cout << "\n###                                                   ###";
    cout << "\n#########################################################";
    cout << "\nDigite um número positivo até " << LIMIT << ". Qualquer outro, sai: ";
    cin >> n;

    if (n > LIMIT || n < -LIMIT)
        exit(0); // Limite intervalo de inteiro no Dev-Cpp, embora seja maior
    else
        num = (int)n; // Converte real para inteiro

    while (num > 0)
    {
        do // Início do trecho que empilha os restos que irão gerar o número binário
        {
            resto = num % 2;
            empilha(pilha, topo, resto);
            num /= 2;

        } while (num > 0); // Fim do trecho de empilhamento
    }

    cout << "\nConvertido para binário: ";

    sinal = desempilha(pilha, topo, resto);

    while (sinal == 1) // Os restos que irão exibir o número binário
    {
        cout << resto;
        sinal = desempilha(pilha, topo, resto);
    } // Fim do trecho de desempilhamento

    topo = -1;

    cout << "\n\n";

    return 0;
}

void empilha(int p[], int &t, int v)
{
    if (t == TAM - 1) // Este teste não é necessário porque já limitei a entrada
        cout << "\nATENÇÂO, Pilha Cheia\n";
    else
    {
        t++;      // Atualiza o topo
        p[t] = v; // Pilha recebe valor
    }
}

int desempilha(int p[], int &t, int v)
{
    if (t == -1)
        return 0;
    else
    {
        v = p[t]; // Guarda o valor do topo
        t--;      // Atualiza o topo
        return 1;
    }
}
