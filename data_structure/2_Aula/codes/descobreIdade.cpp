#include <iostream>

using namespace std;

int descobreIdade(int anoAtual, int anoNascimento);

int main() {

    int anoAtual, anoNascimento, idade;

    cout << "Digite o ano atual: ";
    cin >> anoAtual;
    cout << "Digite o ano de nascimento: ";
    cin >> anoNascimento;
    idade = descobreIdade(anoAtual, anoNascimento);
    cout << "A idade do individuo é: " << idade << endl;

    return 0;
}

int descobreIdade(int anoAtual, int anoNascimento) {
    return anoAtual - anoNascimento;
}