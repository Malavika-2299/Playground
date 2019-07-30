#include<stdio.h>
int main()
{
	int n,a,d,t,nt;
      scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    t=(n+1)/2;
    nt=a+(t-1)*d;
    printf("%d",nt);
  }
  else
  {
     a=0,d=1;
    t=n/2;
    nt=a+(t-1)*d;
    printf("%d",nt);
  }
  return 0;
}
    