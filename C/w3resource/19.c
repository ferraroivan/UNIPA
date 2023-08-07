#include <stdio.h>

// Write a C program that accepts 4 integers p, q, r, s from the user where q, r and s are positive and p is even. If q is greater than r and s is greater than p and if the sum of r and s is greater than the sum of p and q print "Correct values", otherwise print "Wrong values".


int main(int argc, char* argv[]) {

  int p, q, r, s;

  printf("Input the first integer: ");
  scanf("%d", &p);
  printf("Input the second integer: ");
  scanf("%d", &q);
  printf("Input the third integer: ");
  scanf("%d", &r);
  printf("Input the fourth integer: ");
  scanf("%d", &s);

  if (q > r && s > p && r+s > p+q && r > 0 && s > 0 && p%2==0) {
    printf("Correct values");
  } else {
    printf("Wrong values");
  }

  return 0;
}
