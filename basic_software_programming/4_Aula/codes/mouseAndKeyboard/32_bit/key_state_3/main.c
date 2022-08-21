#include <GL/glut.h>
#include <string.h>
#include <stdio.h>

GLfloat xf, yf, win;
GLint view_w, view_h;
char texto[30];
GLfloat win, r, g, b;
GLint view_w, view_h, primitiva;

void Texto(char *string)
{
    glPushMatrix();                          
    glRasterPos2f(-win, win - (win * 0.08)); 
    while (*string)
        glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_10, *string++);
    glPopMatrix();
}
void Draw(void)
{
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    glClear(GL_COLOR_BUFFER_BIT);
    glBegin(GL_POLYGON);
    glVertex2f(0.0f, 0.0f);
    glVertex2f(xf, 0.0f);
    glVertex2f(xf, yf);
    glVertex2f(0.0f, yf);
    glEnd();
    glColor3f(1.0f, 1.0f, 1.0f);
    Texto(texto);

    glFlush();
}
void Inicia(void)
{
    glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    xf = 50.0f;
    yf = 50.0f;
    win = 250.0f;
}
void MudaTamanhoJanela(GLsizei w, GLsizei h)
{
    glViewport(0, 0, w, h);
    view_w = w;
    view_h = h;
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-win, win, -win, win);
}
void Teclado(unsigned char key, int x, int y)
{
    switch (key)
    {
    case 'a': 
        glColor3f(0.0f, 0.0f, 1.0f);
        break;
    case 'v': 
        glColor3f(1.0f, 0.0f, 0.0f);
        break;
    }
    glutPostRedisplay();
}
void Mouse(int button, int state, int x, int y)
{
    if (button == GLUT_LEFT_BUTTON)
        if (state == GLUT_DOWN)
        {
            xf = ((2 * win * x) / view_w) - win;
            yf = (((2 * win) * (y - view_h)) / -view_h) - win;
        }
    glutPostRedisplay();
}
void MoveMouseComBotaoPressionado(int x, int y)
{

    sprintf(texto, "Botao pressionado(% d, % d)", x, y);
    glutPostRedisplay();
}
void MoveMouse(int x, int y)
{
    sprintf(texto, "(% d, % d)", x, y);
    glutPostRedisplay();
}
int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(350, 300);
    glutInitWindowPosition(10, 10);
    glutCreateWindow("Interacao com Mouse e Teclado");
    glutDisplayFunc(Draw);
    glutReshapeFunc(MudaTamanhoJanela);
    glutKeyboardFunc(Teclado);
    glutMouseFunc(Mouse);
    glutMotionFunc(MoveMouseComBotaoPressionado);
    glutPassiveMotionFunc(MoveMouse);
    Inicia();
    glutMainLoop();
}