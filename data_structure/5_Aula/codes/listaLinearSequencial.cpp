#include <iostream>
#include <locale.h> // setlocale
#include <stdlib.h> // system
#include <string>   // Textos em geral

using namespace std;

void insere(int codigo[], int& t, int tamanho);
void exibe(int codigo[], int t);
void elemento(int codigo[], int t);

int main()
{

    setlocale(LC_ALL, "Portuguese");

    int codigoProduto[5];
    int tam, op;

    // Inicialização
    tam = 0;

    do
    {

        // Obtem a opção
        // system("clear");
        cout << "\nMenu - LISTA\n";
        cout << "\n0- Reiniciar a LISTA";
        cout << "\n1- Inserir código na lista";
        cout << "\n2- Exibir LISTA";
        cout << "\n3- Exibir tamanho da LISTA";
        cout << "\n4- Exibir um elemento da LISTA";
        cout << "\n5- Sair";

        // Obtém opção
        cout << "\n\nDigite a opção: ";
        cin >> op;

        system("clear");

        // Executa a ação escolhida
        switch (op)
        {
        case 0: // reinicialização
            tam = 0;
            break;
        case 1:
            insere(codigoProduto, tam, 5);
            break;

        case 2:
            exibe(codigoProduto, tam);
            break;
        case 3:
            cout << "\nTamanho da LISTA: " << tam;
            break;
        case 4:
            elemento(codigoProduto, tam);
            break;
        case 5:
            cout << "\nFinalizando o programa da LISTA.\n";
            break;

        default:
            cout << "Opção inválida";
            break;
        }

    } while (op != 5);

    return 0;
}

void insere(int codigo[], int& t, int tamanho)
{
    int prod;

    // Verifica se a lista está cheia
    if (tamanho == t)
    {
        cout << "\nAtenção! \nLista cheia.\n";
    }
    else
    {
        cout << "\nDigite o código do produto a ser inserido: ";
        cin >> prod;

        codigo[t] = prod;

        t++;
    }
}

void exibe(int codigo[], int t)
{
    int x;

    // Verifica se tem algum elemento na lista
    if (t == 0)
    {
        cout << "\nAtenção! \nLista vazia.\n";
    }
    else
    {
        cout << "\nRelação dos códigos.\n";

        for (x = 0; x < t; x++)
        {
            cout << "\n"
                 << codigo[x];
        }
    }
}

void elemento(int codigo[], int t)
{
    int prod, posicao;

    if (t == 0)
    {
        cout << "\nAtenção! \nLista vazia.\n";
    }
    else
    {
        cout << "\nQual a posição que deseja? ";
        cin >> posicao;

        posicao--;

        if (posicao >= t)
        {
            cout << "\nAtenção! \nNenhum código armazenado ou posição inexistente.\n";
        }
        else
        {
            cout << "\nCódigo: " << codigo[posicao] << "\n";
        }
    }
}
