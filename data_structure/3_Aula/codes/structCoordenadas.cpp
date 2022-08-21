#include <iostream>

using namespace std;

int main()
{

    struct coordenadas
    {
        int x, y;
    };

    coordenadas a = {-5, 2}, b = {6, 5};
    
    cout << "\nCoordenadas de a(" << a.x << ", " << a.y << ") ";
    cout << "\nCoordenadas de b(" << b.x << ", " << b.y << ") ";

    cout << "\n\n";

    return 0;
}