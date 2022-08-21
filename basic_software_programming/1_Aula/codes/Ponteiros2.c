#include <stdio.h>

int c[3] = {2, 3, 4};
int *pc;

void main()
{
    printf("Antes: \nc \t\t pc \n%d \t %d \n", c, pc);
    pc = &c[0];

    printf("\npc: %d", *pc);
    pc++;
    printf("\npc: %d", *pc);
    pc++;
    printf("\npc: %d\n", *pc);

}