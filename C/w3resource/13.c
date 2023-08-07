#include <stdio.h>
#include <stdlib.h>

int max(int arr[]) {

  int max;
  int res;

  res = (arr[0]+arr[1] + (abs(arr[0]-arr[1]))) / 2;
  max = (res + arr[2] + (abs(res-arr[2]))) / 2;


  return max;

}

int main(int argc, char* argv[]) {

  int arr[3];

  for(int i = 0; i < 3; i++){
    printf("Input integer: ");
    scanf("%d", &arr[i]);
  }

  printf("Max value: %d", max(arr));
  
  return 0;
}
