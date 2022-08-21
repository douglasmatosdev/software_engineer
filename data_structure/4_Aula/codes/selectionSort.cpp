#include <iostream>
#include <locale.h>
#include <stdlib.h>
#include <string>

using namespace std;

void selectionSort(int vet[], int tam);
void imprimirVetor(int vet[], int tam);

int main()
{

    setlocale(LC_ALL, "Portuguese");

    int vetor[5] = {13, 23, 3, 8, 1};
    int i;

    cout << "\nVetor original (Não ordenado):\n";
    imprimirVetor(vetor, 5);
    cout << "\n\n";

    selectionSort(vetor, 5);

    cout << "\nVetor após ordenação:\n";
    imprimirVetor(vetor, 5);
    cout << "\n\n";

    return 0;
}

void selectionSort(int vetor[], int tamanho)
{
    int indexMin, index, subIndex;

    // Percorre todos os números
    for (index = 0; index < tamanho; index++)
    {

        // Define o elemento atual como o menor
        indexMin = index;

        // Encontra o menor valor após "index + 1"
        for (subIndex = index + 1; subIndex < tamanho; subIndex++)
        {
            if (vetor[subIndex] < vetor[indexMin])
            {
                indexMin = subIndex;
            }
        }

        cout << "Troca: " << vetor[index] << " <= " << vetor[indexMin] << endl;

        if (indexMin != index) {

            //Troca números
            int temp = vetor[indexMin];
            vetor[indexMin] = vetor[index];
            vetor[index] = temp;
        }
    }
}
void imprimirVetor(int vetor[], int tamanho)
{
    int index;
    for (index = 0; index < tamanho; index++)
    {
        char tab = (index != 0) ? '\t' : ' ';
        cout << tab << vetor[index];
    }
}