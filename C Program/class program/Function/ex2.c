#include<stdio.h>
int avg();
int main ()
{
    int c;
    c=avg();
    printf("avg of number:%d",c);
}
int avg()
{
    int a,b;
    printf("enter the number\n\n");
    scanf("%d%d",&a,&b);
    return (a+b)/2;
}