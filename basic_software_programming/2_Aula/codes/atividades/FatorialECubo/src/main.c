#include <stdio.h>
#include "fatorial.h"
#include "cubo.h"

int main()
{
    int input, result;

    printf("Digite um número: ");
    scanf("%d", &input);

    result = fatorial(input);
    printf("O fatorial de %d é %d\n", input, result);

    result = cubo(input);
    printf("O cubo de %d é %d\n", input, input * input * input);

    return 0;
}
/*

gcc -c -g src/main.c -Iinclude -o obj/main.o && \
gcc -c -g src/fatorial.c -Iinclude -o obj/fatorial.o && \
gcc -c -g src/cubo.c -Iinclude -o obj/cubo.o && \
gcc -g -o application obj/main.o obj/fatorial.o obj/cubo.o && \
./application
*/