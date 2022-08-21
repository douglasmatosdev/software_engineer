#include <iostream>

using namespace std;

int main()
{

    struct professor
    {
        int matricula;
        char titulo[30];
    } L = {22, "matematica"}; 
    
    int n = 2;

    for (int i = 0; i < n; i++)
        cout << L.matricula << " " << L.titulo << endl;

    return 0;
}