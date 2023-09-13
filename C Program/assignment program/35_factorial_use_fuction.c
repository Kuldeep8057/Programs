#include<stdio.h>
void fact();
int main()
{
    fact();
    return 0;
}
void fact()
{
    int n,i,fact=1;
    printf("enter the number ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    printf("factorial of %d is %d",n,fact);
}
