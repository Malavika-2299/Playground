#include <stdio.h>
int main() {
	int n,r;
  scanf("%d",&n); 
    r=n%10;
  while(n>=10)
  {
  
    n=n/10;
    
  }
  printf("%d",(r+n));
    
	return 0;
}