#include<stdio.h>
int main()
{
  int l=6;
  int b=9;
  int peri,area;
  peri=2*(l+b);
  area=l*b;
  printf("The perimeter of the rectangle is: %d cm",peri);
  printf("\nThe area of the rectangle is: %d sq cm",area);
  return 0;
}