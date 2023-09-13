#include<stdio.h>
void swap();
int main ()
{
    swap();
    return 0;
}
void swap()
{
    int a,b;
    printf("enter the number \n");
    scanf("%d %d",&a,&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("swap number is %d %d",a,b);
}