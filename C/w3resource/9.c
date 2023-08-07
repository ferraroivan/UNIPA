#include <stdio.h>

int main(int argc, char* argv[]) {

  int input[2];
  int sum = 0;

  for(int i = 0; i < 2; i++) {
    printf("Inuput integer: ");
    scanf("%d", &input[i]);
    sum += input[i];
  }

  printf("Sum of the above integers: %d", sum);
  
  return 0;

}
