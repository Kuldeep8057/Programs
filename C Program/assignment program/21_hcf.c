#include<stdio.h>
int main()
{
   int  a,b,i,hcf;
   printf("enter the two number which take hcf a=   ");
   scanf("%d\n%d",&a,&b);
   for (i=1;i<=a || i<=b;i++)
   {
   if(a%i==0 || b%i==0)
   hcf=i;
   }
   printf("HCF if %d and %d = %d",a,b,hcf);
    return 0;
}