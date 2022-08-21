#include <stdio.h>
#include <time.h>

int main()
{
    struct tm *data_atual;

    time_t current_time;

    current_time = time(NULL);

    data_atual = localtime(&current_time);

    printf("\nDia do ano...: %d \n", data_atual->tm_yday);

    return 0;
}