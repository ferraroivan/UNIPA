#include <stdio.h>

// Write a C program to convert a given integer (in days) to years, months and days, assuming that all monts have 30 days and all years have 363 days

int main(int argc, char* argv[]) {

  int inputDays, years, months, days;

  printf("Input no. of days: ");
  scanf("%d", &inputDays);

  years = inputDays / 365;
  months = (inputDays / 30) - (years * 12);
  days = inputDays - (years * 12 * 30) - (months * 30); 



  // 2535 - 6 * 12 * 30 (2160) - 12 * 30 (360)

  printf("%d Year(s)\n", years);
  printf("%d Month(s)\n", months);
  printf("%d Day(s)", days);
  printf("days = %d - (%d * 12 * 30) - ( %d * 30)", inputDays, years, months);

  return 0;
}
