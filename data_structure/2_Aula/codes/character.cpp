#include <iostream>

using namespace std;

void linha(char c, int n);

int main()
{
    linha('A', 10);

    return 0;
}

void linha(char c, int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << c;
    }
    cout << endl;
}