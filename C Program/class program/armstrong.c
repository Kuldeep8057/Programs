#include<stdio.h>
int main()
{
int n,arm=0,no,rem;
printf("enter the number: ");
scanf("%d",&n);
no=n;
while (n>0)
{
    rem=n%10;
    arm=arm+rem*rem*rem;
    n=n/10;
}
if(arm== no)
{
    printf("No is armstrong:%d",arm);
}
else
{
    printf("No is not armstrong");
}
    return 0;
}