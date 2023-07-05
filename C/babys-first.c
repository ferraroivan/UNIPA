#include <stdio.h>

int getPass(char *b){
  char pass = "";
}

int main(int argc, char **argv){
  char buffer[64];

  printf("Welcome to your first crackme problem!\n");
  printf("What is the password?: ");
  scanf("%64s", buffer);

  if (getPass(buffer)){
    printf("That is correct!\n");
  }
}
