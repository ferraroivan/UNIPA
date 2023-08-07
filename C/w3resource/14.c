#include <stdio.h>

// Write a C program to calculate a bike’s average consumption from the given total distance (integer value) travelled (in km) and spent fuel (in litters, float number – 2 decimal points).

int main(int argc, char* argv[]) {

  int km;
  float fuel;

  printf("Input total distance in km: ");
  scanf("%d", &km);
  printf("Input total fuel spent in liters: ");
  scanf("%f", &fuel);
  printf("Average consumption (km/lt) %f", km/fuel);

  return 0;

}
