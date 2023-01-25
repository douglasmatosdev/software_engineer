#include <iostream>

#define tamanho 10

using namespace std;

int main()
{

    int op, L, inicio, fim, meio, procura, matricula[] = {2, 4, 5, 6, 13, 15, 18, 23, 29, 30};
    float CR[] = {8, 9, 7, 8, 6, 10, 9, 9, 9, 7, 9, 9};
    system("clear");
    // Exibe a procura
    do
    {

        cout << "\n\n1- Listar CR";
        cout << "\n2- Listar Matriculas";
        cout << "\n3- Listar Matriculas e CR";
        cout << "\n4- Procura";
        cout << "\n5- Sai";
        cout << "\nOpção: ";
        cin >> op;

        system("clear");

        if (op == 1)
        {

            cout << "\nCR\n";
            for (L = 0; L < tamanho; L++)
            {
                cout << "\n"
                     << L + 1 << ": " << CR[L];
            }
        }
        else if (op == 2)
        {

            cout << "\nMatriculas\n";
            for (L = 0; L < tamanho; L++)
            {
                cout << "\n"
                     << L + 1 << ": " << matricula[L];
            }
        }
        else if (op == 3)
        {
            cout << "\nMatriculas\tCR\n";
            for (L = 0; L < tamanho; L++)
            {
                cout << "\n" << matricula[L] << "\t\t" << CR[L];
            }
        }
        else if (op == 4)
        {
            // Pesquisa Binária
            cout << "Digite a matricula a ser procurada: ";
            cin >> procura;

            inicio = 0;
            fim = tamanho - 1;
            meio = (inicio + fim) / 2;
            cout << "\n"
                 << inicio << "\t" << meio << "\t" << fim; // Pode retirar

            while (procura != matricula[meio] && inicio != fim)
            {
                if (procura > matricula[meio])
                {
                    inicio = meio + 1;
                }
                else
                {
                    fim = meio;
                }

                meio = (inicio + fim) / 2;
                cout << "\n"
                     << inicio << "\t" << meio << "\t" << fim; // Pode retirar
            }
            if (matricula[meio] == procura)
            {
                cout << "\nCR : " << CR[meio] << endl;
            }
            else
            {
                cout << "\nMatricula não encontrada\n";
            }
        }
        else if (op == 5)
        {
            cout << "\nfim\n";
        }
        else
        {
            cout << "Opção inválida\n";
        }
        cout << "\n\n";
    } while (op != 5);

    return 0;
}