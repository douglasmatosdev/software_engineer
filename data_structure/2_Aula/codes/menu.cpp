#include <iostream>

using namespace std;

void menu();

int main()
{
    int opcao;

    menu();

    cin >> opcao;

    switch (opcao)
    {
    case 1:
        cout << "Vamos estudar Pilha\n";
        break;
    case 2:
        cout << "Vamos estudar Fila\n";
        break;
    case 3:
        cout << "Vamos estudar Lista\n";
        break;
    case 4:
        cout << "Vamos estudar Árvore\n";
        break;
    case 5:
        cout << "Vamos estudar Grafo\n";
        break;
    case 6:
        cout << "Sair\n";
        break;
    }

    return 0;
}

void menu()
{
    cout << "\nMenu\n";
    cout << "\n1-Pilha";
    cout << "\n2-Fila";
    cout << "\n3-Lista";
    cout << "\n4-Arvore";
    cout << "\n5-Grafo";
    cout << "\n6-Sair";
    cout << "\nDigite a opcao desejada: ";
}