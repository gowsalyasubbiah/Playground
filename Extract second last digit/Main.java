#include<stdio.h>
int main()
{
  int i,rem,second;
  scanf("%d",&i);
  rem=i%100;
  second=rem/10;
  printf("%d",second);
  return 0;
}