#include <stdio.h>
#include <stdlib.h>

typedef unsigned int uint32_t;

struct Box
{
    int used;
    char stuff[64];
};

struct Box g_Boxes[100] = {0};

void printBox(uint32_t i)
{
    printf("Box %d: %s\n", i, g_Boxes[i].stuff);
    return;
}

void editBox(uint32_t i)
{
    if(g_Boxes[i].used == 0)
    {
        printf("Whats in the box?: ");
        scanf("%64s", g_Boxes[i].stuff);
        g_Boxes[i].used = 1;
    } else {
        printf("Box is already occupied\n");
    }
    return;
}

int read_int(uint32_t *out)
{
    uint32_t i = 0;
    int n_parsed = scanf("%u", &i);
    if (n_parsed > 0)
    {
        *out = i;
    }
    return n_parsed;
}

void printMenu()
{
    printf("Inventory simulator 1.0\n");
    printf("\tp: print a box\n");
    printf("\te: edit a box\n");
    printf("\tq: quit\n");
}

int main(int argc, char **argv)
{
    char selection = 'a';
    

    while(selection != 'q')
    {
        printMenu();
        selection = getchar();
        if(selection == '\n')
        {
            continue;
        }
        
        int box = 0;
        switch (selection){
            case 'q':
                break;
            case 'p':
                box = 0;
                printf("Box ID: ");
                if(!read_int(&box))
                {
                    printf("Please input an integer\n");
                    continue;
                }
                printBox(box);
                break;
            case 'e':
                box = 0;
                printf("Box ID: ");
                if(!read_int(&box))
                {
                    printf("Please input an integer\n");
                    continue;
                }
                editBox(box);
                break;
            case '\n':
                break;
            default:
                printf(":(\n");
        }
    }
}
