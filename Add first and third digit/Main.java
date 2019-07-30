#include<stdio.h>
int main()
{
  int n,r;
  scanf("%d",&n);
    r=n%10;
    n=n/100;
      printf("%d",(r+n));
    return 0;
}