#include <stdio.h>

int main()

{

    int arr[] = {2, 3, 4, 5};

    int *p = (arr + 2);

    size_t n = sizeof(arr) / sizeof(int);

    printf("%d\n", n);

    printf("%d\n", *arr + 15);

    return 0;
}