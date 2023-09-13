#include<stdio.h>
int main()
{
/*int rad,area;
printf("enter the value of rad= ");
scanf("%d",&rad);
area=3.14*rad*rad;
printf("area of circle= %d",area);*/
/*int a,b;
printf("enter the value of a = ");
scanf("%d",&a);
printf("enter the value of b = ");
scanf("%d",&b);
a=a+b;
b=a-b;
a=a-b;
printf("swap number of a=%d,b=%d",a,b);*/
/*int a,b;
printf("enter the value of a = ");
scanf("%d",&a);
printf("enter the value of b = ");
scanf("%d",&b);
a=a^b;
b=a^b;
a=a^b;
printf("swapping numberb of a=%d,b=%d",a,b);*/
int a,b,c;
printf("enter the value of a = ");
scanf("%d",&a);
printf("enter the value of b = ");
scanf("%d",&b);
c=a&b;
c=a~b;
c=a^b;
printf("%d",c);
    return 0;
}