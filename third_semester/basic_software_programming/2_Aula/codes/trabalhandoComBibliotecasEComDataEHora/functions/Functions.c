#include <stdio.h>

// function declaration
int max(int num1, int num2);

int main()
{
    system("clear");

    // definition varibles here
    int a = 300;
    int b = 200;
    int ret;

    // call function to get max value
    ret = max(a, b);

    printf("The max value is: %d\n", ret);

    return 0;
}

// function returns the max value between two numbers
int max(int num1, int num2)
{
    // declaration local variables
    int result;

    if (num1 > num2)
        result = num1;
    else
        result = num2;

    return result;
}