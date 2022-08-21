#include <iostream>

using namespace std;

float areaRetangulo(float base, float altura);

int main() {

    float base, altura, area;
    cout << "Digite a base do retangulo: ";
    cin >> base;
    cout << "Digite a altura do retangulo: ";
    cin >> altura;
    area = areaRetangulo(base, altura);
    cout << "A area do retangulo e: " << area << endl;

    return 0;
}

float areaRetangulo(float base, float altura) {
    return base * altura;
}
