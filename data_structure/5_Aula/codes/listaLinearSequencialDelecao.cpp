#include <iostream>
#include <locale.h>
#include <stdlib.h>
#include <string>

using namespace std;

void insere(int matric[], int m, int &t, int tamanho);
void exibe(int matric[], int t);
int buscaSequencial(int matric[], int m, int t);
void remove(int matric[], int m, int &t);

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int tam, matricula[5], mat, posicao, op;

    // Inicialização
    tam = 0;
    do
    {
        // system("clear");
        cout << "\nMenu - LISTA\n";
        cout << "\n0- Reiniciar a LISTA";
        cout << "\n1- Inserir matricula";
        cout << "\n2- Exibir LISTA";
        cout << "\n3- Procurar matricula na LISTA";
        cout << "\n4- Remover matricula da LISTA";
        cout << "\n5- Sair";

        cout << "\n\nOpção: ";
        cin >> op;

        switch (op)
        {
        case 0: // reinicialização
            tam = 0;
            break;
        case 1:
            cout << "\nDigite matrícula a ser inserida: ";
            cin >> mat;

            insere(matricula, mat, tam, 5);
            break;

        case 2:
            exibe(matricula, tam);
            break;
        case 3:
            cout << "\nQual matricula a ser procurada? ";
            cin >> mat;

            posicao = buscaSequencial(matricula, mat, tam);
            if (posicao == -1)
            {
                cout << "\nAtenção! Lista Vazia";
            }
            else if (posicao == -2)
            {
                cout << "\nAtenção! Matrícula não encontrada\n";
            }
            else
            {
                cout << "\nMatricula encontrada na posição: " << posicao + 1 << "\n";
            }
            break;
        case 4:
            cout << "\nQual matricula a ser removida? ";
            cin >> mat;

            remove(matricula, mat, tam);
            break;
        case 5:
            cout << "\nFinalizando o programa da LISTA.\n";
            break;

        default:
            cout << "Opção inválida";
            break;
        }

        cout << "\n\n";
    } while (op != 5);

    return 0;
}

void insere(int matric[], int m, int &t, int tamanho)
{
    if (tamanho == t)
    {
        cout << "\nAtenção! \nLista cheia\n";
    }
    else
    {
        matric[t] = m;
        t++;
    }
}

void exibe(int matric[], int t)
{
    int x;

    if (t == 0)
    {
        cout << "\nAtenção! \nLista vazia\n";
    }
    else
    {
        cout << "\nRelação das Matrículas\n";
        for (x = 0; x < t; x++)
        {
            cout << "\n"
                 << matric[x];
        }
    }
}

int buscaSequencial(int matric[], int m, int t)
{
    int x;
    if (t == 0)
    {
        return -1; // testa lista vazia
    }

    for (x = 0; x < t; x++)
    {
        if (matric[x] == m)
        {
            return x; // retorna o deslocamento do endereço base
        }
    }

    return -2; // percorreu toda a lista e não achou
}

void remove(int matric[], int m, int& t)
{
    int pos, x;
    pos = buscaSequencial(matric, m, t);

    if (pos == -1) // testando se a lista está vazia
    {
        cout << "\nAtenção! \nA lista está vazia\n";
    }
    else if (pos == -2)
    {
        cout << "\nAtenção! \nMatricula não encontrada\n";
    }
    else
    {
        // Desloca todos os elementos da lista, se necessário, deixando vazios ao final
        for (x = pos; x < t; x++)
        {
            matric[x] = matric[x + 1];
        }
        
        t--; // Atualiza o tamanho da lista
        
        cout << "\n\nMatricula Removida\n";
    }
}