#include <dos.h>

// Run code online
// https://onlinegdb.com/WFhorlW3vd

/*
No programa a seguir, envia-se o valor 3 para ax e se invoca a interrupção do mouse. Essa
subfunção retorna informações de pressionamento de botão no registro bx. Toda a informação
de toque do botão é armazenada nos primeiros três bits do registro bx. Então, é realizado um
AND de bx com 7 para separar os três primeiros bits, armazenando-os na variável button.
Se o valor do primeiro for 1, o botão esquerdo foi pressionado; e, se o valor for 0, então não
foi pressionado. O segundo corresponde ao botão direito e o último ao botão do meio. O
programa continua até uma tecla ser apertada –while (!kbhit () ).
*/

union REGS in, out;

void showmouse_text()
{
    in.x.ax = 1;
    int86(0X33, &in, &out);
}

void detecta_mouse()
{
    in.x.ax = 0;
    int86(0X33, &in, &out); // Invoca a interrupção
    if (out.x.ax == 0)
        printf("\nMouse falhou a inicialização.");
    else
        printf("\nMouse foi inicializado com sucesso.");
}

void detcta_clique()
{
    int button;
    while (!kbhit())
    {
        in.x.ax = 3;
        int86(0X33, &in, &out);
        button = out.x.bx & 7;
        switch (button)
        {
        case 1:
            printf("Botão esquerdo pressionado\n");
            break;
        case 2:
            printf("Botão direito pressionado\n");
            break;
        case 4:
            printf("Botão do meio pressionado\n");

        default:
            printf("Nenhum botão pressionado\n");
        }
        delay(400);
    }
}

int main()
{
    detecta_mouse();
    showmouse_text();
    detcta_clique();
    // hide_mouse();
    getch();
    return 0;
}