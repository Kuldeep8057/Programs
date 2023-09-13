#include<stdio.h>
int main()
{
 int n,no,sum=0,rem;
 printf("enter the number: ");
 scanf("%d",&n);
 no=n;
 while(n>0)
 {
    rem=n%10;
    sum=sum+rem*rem*rem;
    n/=10;
 }
 if(no==sum)
 {
    printf("armstrong no");
 }
 else{
    printf("not armstrong");
 }
    return 0;
}