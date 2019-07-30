#include<stdio.h>
int main()
{
 int n=365,d=4,res,res1;
  res=n%d;
  res1=n/d;
  printf("Quotient: %d\n",res1);
  printf("Remainder: %d",res);
  return 0;
}