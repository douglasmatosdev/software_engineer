#include "max.h"
#include <stdio.h>

int main()
{

    int a, b, maxValue;
    a = 2;
    b = 3;
    maxValue = max(a, b);

    printf("%d\n", maxValue);

    return 0;
}

// gcc -c -g src/main.c -Iincludes -o bin/main.o
// gcc -c -g src/max.c -Iincludes -o bin/max.o
// gcc -g -o maxNumber bin/main.o bin/max.o