#include <iostream>
#include <cstdlib>

#define TAM 100

using namespace std;

void push(float p[], int &t, float v);
float pop(float p[], int &t);

int main()
{

    int t = -1;
    float a, b, p[TAM];
    char s[10];

    cout << "\n**************************************************";
    cout << "\n*    Calculadora para quatro operações pos-fixa  *";
    cout << "\n*        Digite números ou operadores            *";
    cout << "\n*            Digite  s   para sair               *";
    cout << "\n**************************************************\n";

    do
    {
        cout << "Operações: \t+\t-\t*\t/\n";
        cout << ": ";
        cin >> s;

        switch (s[0])
        {
        case '+':
            a = pop(p, t);
            b = pop(p, t);
            cout << "\n"
                 << a + b << "\n";
            push(p, t, a + b);
            break;

        case '-':
            a = pop(p, t);
            b = pop(p, t);
            cout << "\n"
                 << a - b << "\n";
            push(p, t, a - b);
            break;

        case '*':
            a = pop(p, t);
            b = pop(p, t);
            cout << "\n"
                 << a * b << "\n";
            push(p, t, a * b);
            break;

        case '/':
            a = pop(p, t);
            b = pop(p, t);
            if (a == 0)
                cout << "\nDivisão por 0(zero)\n";
            else
            {
                cout << "\n"
                     << a / b << "\n";
                push(p, t, a / b);
            }
            break;
        default:
            push(p, t, atof(s));
        }
    } while (s[0] != 's');

    cout << "\n\n";

    return 0;
}

// Insere o elemento da pilha
void push(float p[], int &t, float v)
{
    if (t == TAM - 1)
        cout << "\nATENÇÃO. Pilha Cheia\n";
    else
    {
        t++;      // Atualiza o topo
        p[t] = v; // Pilha recebe valor
    }
}

// Remove o elemento da pilha
float pop(float p[], int &t)
{
    float v;
    if (t == -1)
    {
        cout << "\nATENÇÃO. Pilha Vazia\n";
        return 0;
    }
    else
    {
        v = p[t]; // Guarda o valor do topo
        t--;      // Atualiza o topo
        return v;
    }
}