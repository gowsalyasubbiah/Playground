#include<stdio.h>
int main()
{
  int i,first_digit,third_digit,sum;
  scanf("%d",&i);
  first_digit=i/100;
  third_digit=i%10;
  sum=first_digit+third_digit;
  printf("%d",sum);
  return 0;
}