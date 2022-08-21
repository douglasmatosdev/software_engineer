#include <stdio.h>

int main()
{

    int i, A, result = 1;

    scanf("%d", &A);

    printf("%d! = ", A);

    for (i = A; i > 1; i--)
    {
        printf("%d X ", i);
        result = result * i;
    }
    
    printf("%d", i);

    printf(" = %d \n", A, result);

    return 0;
}
