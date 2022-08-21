#include <iostream>
#include <locale.h> // setlocale
#include <stdlib.h> // system
#include <string>   // Textos em geral

#define TAM 5

using namespace std;

void empilha(int p[], int &t, int v);
int desempilha(int p[], int &t, int &v);
void acessoTopo(int p[], int &t);
void situacaoPilha(int p[], int &t);

int main()
{

    setlocale(LC_ALL, "Portuguese");

    int op, val, topo = -1, pilha[TAM], resp;

    do
    {
        // system("clear");
        // system("color f0");

        cout << "\nPILHA( LIFO - Last In - First Out )\n\n";
        cout << "\n1- Inserir um novo valor na pilha";
        cout << "\n2- Remover um novo valor na pilha";
        cout << "\n3- Mostrar o elemento no topo da pilha";
        cout << "\n4- Mostrar situação da pilha";
        cout << "\n5- Sair";

        cout << "\n\nOpção: ";
        cin >> op;

        system("clear");

        switch (op)
        {
        case 1:
            cout << "Digite o valor a ser empilhado: ";
            cin >> val;
            empilha(pilha, topo, val);
            break;
        case 2:
            resp = desempilha(pilha, topo, val);
            if (resp == 0)
                cout << "\nAtenção. \nPilha Vazia.\n";
            else
                cout << "\nValor removido: " << val;
            break;
        case 3:
            acessoTopo(pilha, topo);
            break;
        case 4:
            situacaoPilha(pilha, topo);
            break;
        case 5:
            cout << "\nFinalizando o programa básico de PILHA.\n";
            break;

        default:
            cout << "Opção inválida";
            break;
        }

        cout << "\n\n";

    } while (op);

    return 0;
}

// Insere
void empilha(int p[], int &t, int v)
{
    if (t == TAM - 1)
        cout << "\nAtenção. \nPilha Cheia\n";
    else
    {
        t++;      // atualiza o topp
        p[t] = v; // pilha recebe valor
    }
}

// remove
int desempilha(int p[], int &t, int &v)
{
    if (t == -1)
    {
        return 0;
    }
    else
    {
        v = p[t]; // guarda o valor no topo
        t--;      // atualiza o topo
        return 1;
    }
}

// Mostra o topo
void acessoTopo(int p[], int &t)
{
    if (t == -1)
    {
        cout << "\nAtenção. \nPilha vazia\n";
    }
    else
    {
        cout << "\nElemento do topo da PILHA: " << p[t];
    }
}

// Mostra situação da pilha
void situacaoPilha(int p[], int &t)
{

    if (t == -1)
    {
        cout << "\nAtenção. \nPilha Vazia.\n";
    }
    else if (t == TAM - 1)
    {
        cout << "\nAtenção. \nPilha Cheia\n";
    }
    else
    {
        cout << "\nTotal de elementos na pilha: " << t + 1 << "\n";
        cout << "\n\nEspço disponível na pilha: " << TAM - (t + 1) << "\n";
    }
}