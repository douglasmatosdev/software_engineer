/*
    gcc main.c -o main -lGL -lGLU -lglut && ./main
*/

#include <GL/glut.h>

// Tamanho e posição inicial do quadrado
GLfloat x = 100.0f;
GLfloat y = 150.0f;
GLsizei rsize = 50;

// Tamanho do incremento nas direções x e y
// (número de pixels para se mover a da intervalo de tempo)
GLfloat xstep = 1.0f;
GLfloat ystep = 1.0f;

// Largura e altura da janela
GLfloat windowWidth;
GLfloat windowHeight;

// Função de chamada para fazer o desenho
void Draw(void)
{
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    // Limpa a janela de visualização com a cor de fundo especificada
    glClear(GL_COLOR_BUFFER_BIT);

    // Especifica que a cor corrente é vermelha
    //        R       G       B
    glColor3f(1.0f, 0.0f, 0.0f);

    // Desenha um quadrado preenchido com a cor corrente
    /* // Versão com valores estáticos
    glBegin(GL_QUADS);
    glVertex2i(100, 150);
    glVertex2i(100, 100);
    // Especifica que a cor corrente é azul
    glColor3f(0.0f, 0.0f, 1.0f);
    glVertex2i(150, 100);
    glVertex2i(150, 150);
    glEnd();
    */
    glBegin(GL_QUADS);
    glVertex2i(x, y + rsize);
    glVertex2i(x, y);
    // Especifica que a cor corrente é azul
    glColor3f(0.0f, 0.0f, 1.0f);
    glVertex2i(x + rsize, y);
    glVertex2i(x + rsize, y + rsize);
    glEnd();
    // Executa os comandos OpenGl
    glFlush();
}

// Função callback chamada pela GLUT a cada intervalo de tempo
void Timer(int value)
{
    // Muda a direção quando chega na borda esquerda ou direita
    if (x > windowWidth - rsize || x < 0)
        xstep = -xstep;

    // Move o quadrado horizontalmente
    x += xstep;

    // Redesenha o quadrado com as novas coordenadas
    glutPostRedisplay();
    glutTimerFunc(10, Timer, 1);
}

// Inicializa parâmetros de rendering
void Start(void)
{
    // Define a cor de fundo da janela de visualização como preta
    glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}

// Função de chamada quando o tamanho da janela é alterado
void ChangeSizeWindow(GLsizei w, GLsizei h)
{
    // Evita a divisão por zero
    if (h == 0)
        h = 1;

    //  Especifica as dimensões da Viewport
    glViewport(0, 0, w, h);

    // Inicializa o sistema de coordenadas
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();

    // Estabelece a janela de seleção (left, right, bottom, top)
    if (w <= h)
    {
        windowHeight = 250.0f * h / w;
        windowWidth = 250.0f;
    }
    else
    {
        windowWidth = 250.0f * w / h;
        windowHeight = 250.0f;
    }

    gluOrtho2D(0.0f, windowWidth, 0.0f, windowHeight);
}

// Programa Principal
int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(400, 350);
    glutInitWindowPosition(10, 10);
    glutCreateWindow("Square");
    glutDisplayFunc(Draw);
    glutReshapeFunc(ChangeSizeWindow);
    glutTimerFunc(10, Timer, 1);
    Start();
    glutMainLoop();
}
