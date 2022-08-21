#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <curses.h>

/*
gcc  -I/usr/include/ncursesw ./main.c -lncursesw -o main && ./main
*/

int main()
{

    int c;

    /* Initialize locale, for wide-character support. */
    setlocale(LC_ALL, "");

    /* Start curses mode. */
    initscr();

    /* No line buffering. */
    raw();

    /* No echoing keypresses to the screen. */
    noecho();

    /* We want F1 et cetera. */
    keypad(stdscr, TRUE);

    /* We "print" stuff to the screen,
     * moving the cursor to the next line '\n',
     * and to the beginning of that line '\r'. */
    printw("Press Q to quit.\n\r");

    /* We do need to tell the curses library
     * to update the changes made thus far,
     * i.e. that all changes are visible on screen. */
    refresh();

    while (1)
    {

        /* Wait for user input (one keypress). */
        c = getch();

        if (c == 'Q' || c == 'q')
            break;

        switch (c)
        {
        case KEY_UP:
            printw("Up\n\r");
            break;
        case KEY_DOWN:
            printw("Down\n\r");
            break;
        case KEY_LEFT:
            printw("Left\n\r");
            break;
        case KEY_RIGHT:
            printw("Right\n\r");
            break;
        case '\n':
            printw("Enter\n\r");
            break;
        case ' ':
            printw("Space\n\r");
            break;
        default:
            printw("Code 0x%x\n\r", c);
        }

        refresh();
    }

    /* End curses mode. */
    endwin();

    return 0;
}