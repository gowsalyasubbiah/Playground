#include<stdio.h>
int main()
{
  int i,quo,rem,sum;
  scanf("%d",&i);
  quo=i/10;
  rem=i%10;
  sum=quo+rem;
  printf("%d",sum);
  return 0;
}