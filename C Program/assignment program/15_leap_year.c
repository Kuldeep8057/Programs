#include<stdio.h>
int main()
{
    int n,i=1,fact=1;
    printf("enter the any yearr:- ");
    scanf("%d",&n); 
    if(n%4==0)
    {
        printf("%d year is leap year",n);
    }
    else{
        printf("%d year is not leap year",n);
    }
    return 0;
}