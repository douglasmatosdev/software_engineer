#include <iostream>

using namespace std;

struct cadastro
{
    int matricula;
    float CR;
};

cadastro Entrada();

int main() {

    cadastro aluno;
    aluno = Entrada();

    system("clear");

    cout << "\nMatricula do aluno: " << aluno.matricula << "\tCR: " << aluno.CR << "\n\n";    

    return 0;
}

cadastro Entrada()
{
    cadastro temp;
    cout << "\nMatricula do aluno: ";
    cin >> temp.matricula;
    cout << "\nDigite CR: ";
    cin >> temp.CR;

    return (temp);
}