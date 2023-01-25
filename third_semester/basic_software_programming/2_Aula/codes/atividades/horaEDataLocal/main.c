#include <stdio.h>
#include <time.h>

#define LEN 150

int main()
{
    char buf[LEN];
    time_t current_time;
    struct tm *loc_time;

    // Get current local hour
    current_time = time(NULL);

    // Convert to local hour
    loc_time = localtime(&current_time);

    // Mostra hora e data no formato-padrão
    printf("%s", asctime(loc_time));

    return 0;
}