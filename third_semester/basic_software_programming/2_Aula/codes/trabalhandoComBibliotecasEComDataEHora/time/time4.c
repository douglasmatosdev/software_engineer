#include <stdio.h>
#include <time.h>

/*
struct tm {
    int tm_sec;     //representa os segundos de 0 a 59
    int tm_min;     //representa os minutos de 0 a 59
    int tm_hour;    //representa as horas de 0 a 24
    int tm_mday;    //dia do mês de 1 a 31
    int tm_mon;     //representa os meses do ano de 0 a 11
    int tm_year;    //representa o ano a partir de 1900
    int tm_wday;    //dia da semana de 0 (domingo) até 6 (sábado)
    int tm_yday;    //dia do ano de 1 a 365
    int tm_isdst;   //indica horário de verão se for diferente de zero
};

setdate()	Modifica a data do sistema.
getdate()	Obtém a hora da CPU.
clock()	    Obtém a hora corrente do sistema.
time()	    Obtém a hora corrente do sistema como estrutura. Esta chamada de sistema fornece a quantidade de segundos desde zero hora de 1º de janeiro de 1970.
difftime()	Fornece a diferença entre duas horas dadas.
strftime()	Modifica o formato da hora atual.
mktime()	Converte data e hora do formato tm para o formato time_t (inteiro longo).
localtime()	Recebe um tempo em segundos de uma variável do tipo time_t, converte para o tempo local, armazena os dados na struct e retorna um ponteiro para uma struct do tipo tm com os dados locais.
gmtime()	Converte um valor time_t para uma estrutura tm como o relógio universal (UTC).
ctime()	    Retorna uma string que contém informações de data e hora.
asctime()	Converte tm para uma string no formato Www Mmm dd hh:mm:ss yyyy, em que: Www é o dia da semana; Mmm, o mês, em letras; dd, o dia do mês; hh:mm:ss, a hora; e yyyy, o ano.
*/

int main()
{
    struct tm str_time;
    time_t hour_of_day;

    str_time.tm_year = 2019 - 1900;
    str_time.tm_mon = 7;
    str_time.tm_mday = 24;
    str_time.tm_hour = 10;
    str_time.tm_min = 3;
    str_time.tm_sec = 5;
    str_time.tm_isdst = 0;

    hour_of_day = mktime(&str_time);
    printf(ctime(&hour_of_day));

    return 0;
}