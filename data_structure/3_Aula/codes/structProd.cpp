#include <iostream>
#include <cstring>

using namespace std;

int main()
{

    struct prod
    {
        char nomeProduto[21];
        float valor;
    } produto1 = {"martelo", 35.90}, produto2 = {"furadeira", 256.75}, aux;

    if (strcmp(produto1.nomeProduto, produto2.nomeProduto) > 0)
    {
        aux = produto1;
        produto1 = produto2;
        produto2 = aux;
    }

    cout << "\nNome do produto 1: " << produto1.nomeProduto << "\t" << produto1.valor;
    cout << "\nNome do produto 2: " << produto2.nomeProduto << "\t" << produto2.valor;
    cout << "\n\n";

    return 0;
}