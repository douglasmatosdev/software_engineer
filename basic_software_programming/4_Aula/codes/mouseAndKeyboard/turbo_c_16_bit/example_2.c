#include <dos.h>

#include <graphics.h>

/*
No programa abaixo, usamos a função de biblioteca-padrão initgraph()
para inicializar o sistema gráfico. Essa função recebe três argumentos:
driver de gráficos, modo de gráfico e caminho para o arquivo do driver.
Usando DETECT, que é uma macro definida em graphics.h, dizemos à função para
selecionar um driver adequado. Quando DETECT é usado,
 não é necessário atribuir nada ao modo gráfico.

*/

union REGS in, out;

void showmouse_graphics()

{

    int gdriver = DETECT, gmode, errorcode;

    initgraph(&gdriver, &gmode, "c:\\turboc3\\bgi");

    in.x.ax = 1;

    int86(0X33, &in, &out);

    getch();

    closegraph();
}

void detecta_mouse()

{

    in.x.ax = 0;

    int86(0X33, &in, &out); // Invoca a interrupção

    if (out.x.ax == 0)

        printf("\nMouse falhou a inicializacao");

    else

        printf("\nMouse foi inicializado com sucesso.");
}

int main()

{

    detecta_mouse();

    showmouse_graphics();

    getch();

    return 0;
}