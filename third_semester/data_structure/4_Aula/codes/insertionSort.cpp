#include <iostream>
#include <locale.h>
#include <stdlib.h>
#include <string>

using namespace std;

void insertionSort(int vetor[], int tamanho);

void printVetor(int vetor[], int tamanho);

int main()
{

    setlocale(LC_ALL, "Portuguese");

    int vetor[5] = {13, 23, 3, 8, 1};
    int index;
    int tamanho = 5;

    cout << "\nAntes:\n";
    printVetor(vetor, tamanho);

    insertionSort(vetor, tamanho);

    cout << "\nDepois:\n";
    printVetor(vetor, tamanho);

    cout << "\n\n";

    return 0;
}

void insertionSort(int vetor[], int tamanho)
{
    int valueInsert, positionInsert, index;

    // Percorrer todos os números
    for (index = 1; index < tamanho; index++)
    {
        // Selecione um valor a ser inserido.
        valueInsert = vetor[index];

        // Selecione a posição onde o número deve ser inserido
        positionInsert = index;

        cout << "-------------------------------------\n";
        printVetor(vetor, tamanho);
        cout << "-------------------------------------\n";
        cout << "Valor: " << valueInsert << endl;
        cout << "Posição Inserção: " << positionInsert << "\n\n";

        // Verifica se o anterior não é maior que o valor a ser inserido
        while (positionInsert > 0 && vetor[positionInsert - 1] > valueInsert)
        {
            vetor[positionInsert] = vetor[positionInsert - 1];
            positionInsert--;
            printVetor(vetor, tamanho);
        }

        if (positionInsert != index)
        {
            cout << "\tInsere: " << valueInsert << " na posição: " << positionInsert << endl;
            vetor[positionInsert] = valueInsert;
        }
    }
}

void printVetor(int vetor[], int tamanho)
{
    int index;
    cout << vetor[0];

    for (index = 1; index < tamanho; index++)
    {
        cout << ",\t" << vetor[index];
    }
    cout << endl;
}
