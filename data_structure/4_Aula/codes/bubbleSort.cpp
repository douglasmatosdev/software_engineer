#include <iostream>
#include <locale.h>
#include <stdlib.h>
#include <string>

using namespace std;

void bubbleSort(int vetor[], int tamanho);
void imprimirVetor(int vetor[], int tamanho);

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int vetor[5] = {13, 23, 3, 8, 1};
    int tamanho = 5;

    // Antes da troca
    imprimirVetor(vetor, tamanho);
    cout << "\n\n";

    // ============================================
    //                Selection Sort
    // ============================================
    bubbleSort(vetor, tamanho);
    // ============================================

    cout << "\n\n";

    // Após a troca
    imprimirVetor(vetor, tamanho);
    cout << "\n\n";

    return 0;
}

void bubbleSort(int vetor[], int tamanho)
{
    int temp;
    int index, subIndex;

    bool continuarTroca = false;

    // Percorrer todos os números
    for (index = 0; index < tamanho; index++)
    {

        continuarTroca = false;

        // Loop through numbers falling ahead
        for (subIndex = 0; subIndex < tamanho - 1; subIndex++)
        {

            cout << "-------------------------------------------------\n";
            imprimirVetor(vetor, tamanho);
            cout << "Comparando: " << vetor[subIndex] << " com :" << vetor[subIndex + 1] << endl;

            //  Troca o número mais alto.
            if (vetor[subIndex] > vetor[subIndex + 1])
            {
                temp = vetor[subIndex];
                vetor[subIndex] = vetor[subIndex + 1];
                vetor[subIndex + 1] = temp;

                continuarTroca = true;
            }

            imprimirVetor(vetor, tamanho);
            cout << "\n\n";
        }

        // Se estiver tudo ordenado
        if (!continuarTroca)
        {
            break;
        }
    }
}

void imprimirVetor(int vetor[], int tamanho)
{
    int index;

    cout << vetor[0];

    // Após a troca
    for (index = 1; index < tamanho; index++)
    {
        cout << ", " << vetor[index];
    }
    cout << endl;
}