#include <stdio.h>
#define PI 3.14

// Write a C program to compute the perimeter and area of a circle with a given radius.

float areaCircle(int r) {
  return PI*r*r;
}

float perimeterCircle(int r) {
  return 2*PI*r;
}

int main(int argc, char* argv[]) {
  int r = 7;
  printf("Perimeter of the Circle = %f\n", perimeterCircle(r));
  printf("Area of the Circle = %f", areaCircle(r));

  return 0;

}
