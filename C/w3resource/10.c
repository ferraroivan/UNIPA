#include <stdio.h>

int main(int argc, char* argv[]) {
  
  int a, b;

  printf("Input the first integer: ");
  scanf("%d", &a);
  printf("Input the second integer: ");
  scanf("%d", &b);
  printf("Product of the above two integers = %d", a*b);

  return 0;
}
