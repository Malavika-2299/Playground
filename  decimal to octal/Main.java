#include<stdio.h>
int main()
{
 int n,a[567],i,rc=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a[rc++]=n%8;
    n=n/8;
  }
  for(i=rc-1;i>=0;i--)
  {
    printf("%d",a[i]);
           }
  return 0;
}