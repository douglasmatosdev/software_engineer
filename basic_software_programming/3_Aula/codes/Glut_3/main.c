#include <GL/glut.h>
#include <stdlib.h>

/*
    gcc main.c -o main -lGL -lGLU -lglut && ./main
*/

void init(void);

void display(void);

void keyboard(unsigned char key, int x, int y);

int main(int argc, char **argv)
{

    glutInit(&argc, argv); // Inicializa o GLUT

    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);

    glutInitWindowSize(256, 256); // Especifica as dimensões da janela

    glutInitWindowPosition(100, 100); // Especifica aonde a janela aparece na tela

    glutCreateWindow("Desenhando uma linha"); // Cria a janela

    init();

    glutDisplayFunc(display); // Função que será redesenhada pelo GLUT

    // glutKeyboardFunc(keyboard); //Funções de teclado

    glutMainLoop(); // Mostra todas as janelas criadas

    return 0;
}

// Definição de cada função
void init(void)
{

    glClearColor(1.0, 1.0, 1.0, 1.0); // Cor de fundo

    glOrtho(0, 256, 0, 256, -1, 1); // Modo de projeção ortogonal
}

void display(void)
{

    glClear(GL_COLOR_BUFFER_BIT); // Limpa a janela

    glColor3f(0.0, 0.0, 0.0); // Cor da linha

    glBegin(GL_LINES);

    glVertex2i(40, 200);
    glVertex2i(200, 200); // Coordenadas inicial e final da linha

    glEnd();

    glFlush();
}