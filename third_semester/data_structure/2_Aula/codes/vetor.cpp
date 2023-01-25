#include <iostream>

using namespace std;

int main() {

    int vetor[5]={18, 23, 52, 13, 15};

    cout << "\nValor do primeiro elemento do vetor: " << vetor[0] << endl;
    cout << "Endereço do primeiro elemento do vetor: " << &vetor[0] << endl;
    cout << "Endereço do vetor: " << &vetor << endl;
    cout << "Tamanho do vetor: " << sizeof(vetor) << endl;
    cout << "Vetor: " << vetor << endl;
    cout << "\n\n";

    return 0;
}