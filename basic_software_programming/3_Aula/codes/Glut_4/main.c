#include <GL/glut.h>

/*
    gcc main.c -o main -lGL -lGLU -lglut && ./main
*/

GLfloat x = 100.0f;

GLfloat y = 150.0f;

GLsizei rsize = 50;

// Tamanho do incremento nas direções x e y

//(número de pixels para se mover a cada

// intervalo de tempo)

GLfloat xstep = 1.0f;

GLfloat ystep = 1.0f;

// Largura e altura da janela

GLfloat windowWidth;

GLfloat windowHeight;

// Função chamada para fazer o desenho

void Desenha(void)

{

    glMatrixMode(GL_MODELVIEW);

    glLoadIdentity();

    glClear(GL_COLOR_BUFFER_BIT);

    glColor3f(1.0f, 0.0f, 0.0f);

    glBegin(GL_QUADS);

    glVertex2i(x, y + rsize);

    glVertex2i(x, y);

    glColor3f(0.0f, 0.0f, 1.0f);

    glVertex2i(x + rsize, y);

    glVertex2i(x + rsize, y + rsize);

    glEnd();

    glutSwapBuffers();
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

void Inicializa(void)

{

    glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}

void MudaTamanhoJanela(GLsizei w, GLsizei h)

{

    // Para evitar a divisão por zero

    if (h == 0)
        h = 1;

    glViewport(0, 0, w, h);

    // Inicializa o sistema de coordenadas

    glMatrixMode(GL_PROJECTION);

    glLoadIdentity();

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

int main(int argc, char **argv)
{
    glutInit(&argc, argv);

    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB);

    glutInitWindowSize(400, 350);

    glutInitWindowPosition(10, 10);

    glutCreateWindow("Anima");

    glutDisplayFunc(Desenha);

    glutReshapeFunc(MudaTamanhoJanela);

    glutTimerFunc(10, Timer, 1);

    Inicializa();

    glutMainLoop();
}