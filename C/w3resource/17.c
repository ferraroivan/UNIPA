#include <stdio.h>

// Write a C program to convert a given integer ( in seconds) to hours, minutes and seconds

int main(int argc, char* argv[]) {

  int input, hours, minutes, seconds, temp;

  printf("Input seconds: ");
  scanf("%d", &input);

  hours = (input / 60) / 60;
  temp = hours * 60; // hours in minutes
  minutes = (input / 60) - temp;
  seconds = (input - hours * 60 * 60 - minutes * 60);  

  // 25300 - 7 * 60 * 60 (25200) - 1 * 60 (60)

  printf("There are:\n");
  printf("H:M:S - %d:%d:%d", hours, minutes, seconds);
 
  return 0;
}
