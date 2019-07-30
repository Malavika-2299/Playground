#include<stdio.h>
#define pi 3.14
int main()
{
 float r,angle,len;
 scanf("%f\n%f",&r,&angle);
 len=2*pi*r*(angle/360);
 printf("%.2f",len);
 return 0;
 }