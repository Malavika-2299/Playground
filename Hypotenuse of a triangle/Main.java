#include<stdio.h>
#include<math.h>
int main()
{
  float o,a,h;
  scanf("%f\n%f",&o,&a);
  h=hypot(o,a);
  printf("%.2f",h);
  
  
  
  return 0;
}