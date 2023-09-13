#include<stdio.h>
int main()
{
int n,rev=0,no;
printf("enter the n: ");
scanf("%d",&n);
no=n;
while (n>0)
{
 //   rem=n%10;
 //   rev=rev*10+rem;
    rev=rev*10+n%10;
    n=n/10;
}
if(no==rev)

    printf("No is palindrome:%d",no);

else
    printf("No is not palindrome ");

    return 0;
}