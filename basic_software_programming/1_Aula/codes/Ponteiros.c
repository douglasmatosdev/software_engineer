#include <stdio.h>

int c;
int *pc;

int main()
{
    printf("Antes\n c \t *pc \n %d \t %d \n", c, pc);
    c = 22;
    pc = &c;
    printf("Passo 1: c = 22, pc = &c \n c \t *pc \n %d \t %d \n", c, pc);
    *pc = 2;
    printf("Passo 2: *pc = 2 \n c \t pc \n %d \t %d \n", c, pc);
}