/*
    gcc main.c -o main -lGL -lGLU -lglut && ./main
*/

#include <GL/glut.h>

// Função de chamada para fazer o desenho
void Draw(void)
{
    // Limpa a janela de visualização com a cor de fundo especificada
    glClear(GL_COLOR_BUFFER_BIT);

    //  Executa os comandos OpenGL
    glFlush();
}

// Inicializa parâmetros de renderização
void Start(void)
{
    // Define a cor de fundo da janela de visualização com vermelha
    glClearColor(8.0f, 0.0f, 0.0f, 1.0f);
}

// Programa principal
int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutCreateWindow("First Program");
    glutDisplayFunc(Draw);
    Start();
    glutMainLoop();
}