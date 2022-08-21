#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include <sysexits.h>
#include <glob.h>

#include <linux/input.h>

void usage(int argc, char *argv[])
{
    printf("Usage:\n"
           "\t%s key\n\nvalid keys are:\n"
           "\tA-Za-z\t- Appropriate Letter Key\n"
           "\tlshift\t- Left Shift key\n"
           "\trshift\t- Right Shift key\n"
           "\tlalt\t- Left Alt key\n"
           "\tralt\t- Right Alt key\n",
           argv[0]);

    exit(EX_USAGE);
}

int main(int argc, char *argv[], char *env[])
{
    int i;

    if (argc != 2)
        usage(argc, argv);

    int key;

    if (strcmp(argv[1], "lshift") == 0)
        key = KEY_LEFTSHIFT;
    if (strcmp(argv[1], "lshift") == 0)
        key = KEY_LEFTSHIFT;
    else if (strcmp(argv[1], "rshift") == 0)
        key = KEY_RIGHTSHIFT;
    else if (strcmp(argv[1], "lalt") == 0)
        key = KEY_LEFTALT;
    else if (strcmp(argv[1], "ralt") == 0)
        key = KEY_RIGHTALT;
    else if (strcmp(argv[1], "lctrl") == 0)
        key = KEY_LEFTCTRL;
    else if (strcmp(argv[1], "rctrl") == 0)
        key = KEY_RIGHTCTRL;
    else
        switch (argv[1][0])
        {
        case 'A':
        case 'a':
            key = KEY_A;
            break;
        case 'B':
        case 'b':
            key = KEY_B;
            break;
        case 'C':
        case 'c':
            key = KEY_C;
            break;
        case 'D':
        case 'd':
            key = KEY_D;
            break;
        case 'E':
        case 'e':
            key = KEY_E;
            break;
        case 'F':
        case 'f':
            key = KEY_F;
            break;
        case 'G':
        case 'g':
            key = KEY_G;
            break;
        case 'H':
        case 'h':
            key = KEY_H;
            break;
        case 'I':
        case 'i':
            key = KEY_I;
            break;
        case 'J':
        case 'j':
            key = KEY_J;
            break;
        case 'K':
        case 'k':
            key = KEY_K;
            break;
        case 'L':
        case 'l':
            key = KEY_L;
            break;
        case 'M':
        case 'm':
            key = KEY_M;
            break;
        case 'N':
        case 'n':
            key = KEY_N;
            break;
        case 'O':
        case 'o':
            key = KEY_O;
            break;
        case 'P':
        case 'p':
            key = KEY_P;
            break;
        case 'Q':
        case 'q':
            key = KEY_Q;
            break;
        case 'R':
        case 'r':
            key = KEY_R;
            break;
        case 'S':
        case 's':
            key = KEY_S;
            break;
        case 'T':
        case 't':
            key = KEY_T;
            break;
        case 'U':
        case 'u':
            key = KEY_U;
            break;
        case 'V':
        case 'v':
            key = KEY_V;
            break;
        case 'W':
        case 'w':
            key = KEY_W;
            break;
        case 'X':
        case 'x':
            key = KEY_X;
            break;
        case 'Y':
        case 'y':
            key = KEY_Y;
            break;
        case 'Z':
        case 'z':
            key = KEY_Z;
            break;
        default:
            printf("Unknown Key");
            exit(EX_USAGE);
        }

    FILE *kbd;
    glob_t kbddev;                                   // Glob structure for keyboard devices
    glob("/dev/input/by-path/*-kbd", 0, 0, &kbddev); // Glob select all keyboards

    for (i = 0; i < kbddev.gl_pathc; i++) // Loop through all the keyboard devices
    {
        kbd = fopen(kbddev.gl_pathv[i], "r");

        char key_map[KEY_MAX / 8 + 1]; // Create a byte array the size of the number of keys

        memset(key_map, 0, sizeof(key_map));                     // Initate the array to zero's
        ioctl(fileno(kbd), EVIOCGKEY(sizeof(key_map)), key_map); // Fill the keymap with the current keyboard state

        int keyb = key_map[key / 8]; // The key we want (and the seven others arround it)
        int mask = 1 << (key % 8);   // Put a one in the same column as the key state will be in

        if (keyb & mask) // If they key is pressed
        {
            return 0;
        }

        fclose(kbd);
    }

    return 1;
}
