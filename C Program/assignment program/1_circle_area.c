#include<stdio.h>

int main()
{
    int r,area;
    printf("enter the value of r: ");
    scanf("%d\n",&r);
    area=3.14*r*r;
    printf("area of circle %d is %d",r,area);
    return 0;
}