#include <iostream>

using namespace std;

void troca(float &a, float &b);

int main() {

    float a, b;
    cout << "Digite um número para A: ";
    cin >> a;
    cout << "Digite um número para B: ";
    cin >> b;
    troca(a, b);
    cout << "A = " << a << " B = " << b << endl;


    return 0;
}

void troca(float &a, float &b) {
    float aux;
    aux = a;
    a = b;
    b = aux;
}