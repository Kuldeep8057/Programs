#include<stdio.h>
int main()
{
    int n,i=1,fact=1;
    printf("enter the any number:- ");
    scanf("%d",&n);
    while (i<=n)
    {
        fact=fact*i;
        i++;
    }
    printf("factorial of given no= %d",fact);
    

    return 0;
}