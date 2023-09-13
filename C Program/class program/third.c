#include<stdio.h>
//if a number is divisible by 2 or not
int main()
{
    int a,b,c;
    printf("enter three No:\n");
    scanf("%d%d%d",&a,&b,&c);
    if (a>b && a>c)
    {
        printf("a is greatest");
    }
    else if(b>a && b>c)
    {
        printf("b is greatest");
    }
    else
    {
        printf("c is greatest");
    }
    return 0;
}