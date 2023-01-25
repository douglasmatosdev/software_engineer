#include <iostream>
#include <cctype>

using namespace std;

int main()
{

    struct cadastro
    {
        char palavras[21];
    } palavra[2];

    int index, subIndex;

    for (index = 0; index < 2; index++)
    {
        cout << "\nPalavra: ";
        cin.getline(palavra[index].palavras, 21);
    }
    
    
    for(index = 0; index < 2; index ++)
    {

        palavra[index].palavras[0] = toupper(palavra[index].palavras[0]);
    }


    system("clear");

    for (int index = 0; index < 2; index++)
    {
        for (int subIndex = 0; palavra[index].palavras[subIndex] != '\0'; subIndex++)
        {
            cout
                 << palavra[index].palavras[subIndex];
            cout << "\n";
        }
        cout << "\n\n";
    }

    return 0;
}