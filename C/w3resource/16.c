#include <stdio.h>

// Write a C program to read an amount (integer value) and break the amount into the smallest possible number of bank notes.

int main(int argc, char* argv[]) {

  int total, hundred, fifty, twenty, ten, five, two, one;

  printf("Input the amount: ");
  scanf("%d", &total);

  hundred = total / 100; 
  fifty = (total % 100) / 50; 
  twenty = (total % 100 - fifty * 50) / 20; 
  ten = (total % 100 - fifty * 50 - twenty * 20) / 10;
  five = (total % 100 - fifty * 50 - twenty * 20 - ten * 10) / 5; 
  two = (total % 100 - fifty * 50 - twenty * 20 - ten * 10 - five * 5) / 2;
  one = (total % 100 - fifty * 50 - twenty * 20 - ten * 10 - five * 5 - two * 2) / 1;
  
  printf("%d Note(s) of 100.00\n", hundred);
  printf("%d Note(s) of 50.00\n", fifty);
  printf("%d Note(s) of 20.00\n", twenty);
  printf("%d Note(s) of 10.00\n", ten);
  printf("%d Note(s) of 5.00\n", five);
  printf("%d Note(s) of 2.00\n", two);
  printf("%d Note(s) of 1.00\n", one);

  return 0;

}
