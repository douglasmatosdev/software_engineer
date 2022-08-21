#include <iostream>

#define TAMANHO 3
#define TAXA 1.5
#define CODIGO_MIN 0
#define CODIGO_MAX 10000
#define MSG_INVALID cout << "\nCódigo inválido";
#define MSG_CODIGO cout << "\nCódigo do Produto " << CODIGO_MIN << "-" << CODIGO_MAX << ": ";

using namespace std;

int main()
{

    struct prodCadastro
    {
        int codigo;
        float precoCompra, precoVenda;
    };

    prodCadastro produtos[TAMANHO];
    int index, codigo;

    for (index = 0; index < TAMANHO; index++)
    {
        MSG_CODIGO;
        cin >> codigo;

        while (codigo < CODIGO_MIN || codigo > CODIGO_MAX)
        {
            MSG_INVALID;
            MSG_CODIGO;
            cin >> codigo;
        }

        produtos[index].codigo = codigo;
        cout << "\nPreço de compra: ";
        cin >> produtos[index].precoCompra;
        produtos[index].precoVenda = produtos[index].precoCompra * TAXA;
    }

    system("clear");

    cout << "\n\nCódigo\tCompra\tVenda\n";
    for (index = 0; index < TAMANHO; index++)
    {
        cout << "\n"
             << produtos[index].codigo << "\t" << produtos[index].precoCompra << "\t" << produtos[index].precoVenda;
        cout << "\n\n";
    }

    return 0;
}