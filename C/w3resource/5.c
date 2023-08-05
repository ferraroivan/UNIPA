#include <stdio.h>

// Write a C program to compute the perimeter and area of a rectangle with a height of 7 inches and width of 5 inches.

int area(int h, int w) {
  return h*w;
}

int perimeter(int h, int w) {
  return (h+w)*2;
}

int main(int argc, char* argv[]) {

  int w = 5;
  int h = 7;

  printf("Perimeter of the rectangle = %d\n", perimeter(7,5));
  printf("Area of the rectangle = %d", area(7,5));

  return 0;
  
}


