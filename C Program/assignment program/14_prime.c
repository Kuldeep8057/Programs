#include<stdio.h>
int main()
{
int n,flag=0,i=2;
printf("enter the No: ");
scanf("%d",&n);
while (i<n/2)
{
    if(n%i==0)
    {
    flag=1;
    break;
    }
    i++;
}
    if(flag==0)
        printf("no is prime.",n);
    else 
        printf("no is not prime.",n);
    return 0;
}