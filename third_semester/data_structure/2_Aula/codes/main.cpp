#include <iostream>
#include <locale.h> // setlocale
#include <stdlib.h> // system
#include <string> // texto em geral

using namespace std;

void imprimirMsg();
float calculaImposto();
float soma(float valor1, float valor2);
void alteraDado(float& valor);

int main(){
    setlocale(LC_ALL, "Portuguese");

    float resultado;

    //imprimirMensagem();
    //resultado = calculaImposto();
    //cout << "O imposto é: " << resultado << endl << endl;

    resultado = soma(10, 20);
    cout << "O valor do cáculo é: " << resultado << "\n\n";

    alteraDado(resultado);

    cout << "O resultado foi alterado para : " << resultado << endl << endl;

    return 0;
}

void imprimirMensagem() {
    cout << "Alô mundo\n\n";
}

float calculaImposto() {
    float salario;
    float valorImposto;

    salario = 2000;

    valorImposto= salario * 0.1;

    return valorImposto;
}

float soma(float valor1, float valor2) {
    float total;

    total = valor1 + valor2;

    return total;
}

void alteraDado(float& valor) {
    valor = 100;
}
