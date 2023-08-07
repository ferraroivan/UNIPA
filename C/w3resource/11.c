#include <stdio.h>

int main(int argc, char* argv[]) {

  double weight1, weight2, avg, numberOfItem1, numberOfItem2;


  printf("Weight - Item1: ");
  scanf("%lf", &weight1);
  printf("No. of item1: ");
  scanf("%lf", &numberOfItem1);
  printf("Weight - Item2: ");
  scanf("%lf", &weight2);
  printf("No. of item2: ");
  scanf("%lf", &numberOfItem2);

  avg = (weight1*(numberOfItem1) + weight2*(numberOfItem2)) / (numberOfItem1 + numberOfItem2);

  printf("Average Value = %f", avg);

  return 0;
}
