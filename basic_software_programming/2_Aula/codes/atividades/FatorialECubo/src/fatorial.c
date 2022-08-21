#include "fatorial.h"

int fatorial(int input)
{
    int index, result;
    result = 1;

    for (index = 1; index <= input; index++)
    {
        result *= index;
    }

    return result;
}