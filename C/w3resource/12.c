#include <stdio.h>

int main(int argc, char* argv[]) {

  int id;
  double hours, salaryPerHour, salary;

  printf("Input the Employees ID(Max 10 chars): ");
  int n = scanf("%d", &id);

  if (n != 1) {
    fprintf(stderr, "Failed to read an integer (%d)\n", n);
    return 1;
  }
  printf("Input the working hrs: ");
  scanf("%lf", &hours);
  printf("Salary amount/hr: ");
  scanf("%lf", &salaryPerHour);
  printf("Employees ID = %d\n", id);
 
  salary = salaryPerHour * hours;

  printf("Salary = $ %.2lf", salary);
  
  return 0;

}
