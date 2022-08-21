#include <stdio.h>
#include "../include/biblioteca.h"

int main()
{
    int num;
    printf("Digite um número:");
    scanf("%d", &num);
    printf("\nO fatorial de %d eh igual a %d\n", num, fatorial(num));

    return 0;
}
/*
gcc -c -g src/main.c -Iinclude -o obj/main.o && \
gcc -c -g src/biblioteca.c -Iinclude -o obj/biblioteca.o && \
gcc -g -o fatorial obj/main.o obj/biblioteca.o && \
./fatorial
*/