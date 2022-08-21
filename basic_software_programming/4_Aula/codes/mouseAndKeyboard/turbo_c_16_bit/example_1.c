#include <dos.h>

// Rodando o código online
// https://onlinegdb.com/Ld4zAFUtEc


/*
O programa declara duas variáveis do tipo Union REGS,
que é declarada em dos.h. A Union REGS contém duas estruturas
(struct WORDREGS x estruct BYTEREGS h), como visto na figura 2.

Essas duas estruturas contêm algumas variáveis de 1 byte e 2 bytes de
comprimento que, indiretamente, representam registros da CPU.
Ao colocar 0 no registrador ax e invocar a interrupção do mouse (33h),
 podemos verificar se o driver do mouse está carregado ou não.

Usa-se a função int86() para invocar o método interrupt.int86 (), que recebe três argumentos:

Número da interrupção (0x33) e duas variáveis do tipo Union REGS.

*/

union REGS in, out;

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

    getch();

    return 0;
}