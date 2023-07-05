#include <stdio.h>
#include <time.h>
#include <stdlib.h>
//DEFINE SIZE 5;

int randomizer(){
    srand(time(0));
    int output = rand();
    return output;
}

int main(int argc, char *argv[]){
    printf("Number generated\n");
    printf("%d",randomizer());
}
