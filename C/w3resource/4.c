#include <stdio.h>

// Write a C program to print the following characters in reverse

int main(int argc, char* argv[]) {
  char arr[] = {'X', 'M', 'L'};
  
  for(int i = 3; i > 0; i--) {
    printf("%c", arr[i]);
  }
  
  printf("\n");

  for(int i = 0; i < 3; i++) {
    printf("%c", arr[i]);
  }

  return 0;
}
