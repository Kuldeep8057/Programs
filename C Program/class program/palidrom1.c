#include<stdio.h>
int main()
{
 int n,no,sum=0;
 printf("enter the number: ");
 scanf("%d",&n);
 no=n;
 while (n>0)
 {
 sum=sum*10+n%10;
 n/=10;
 }
 if(no==sum)
 {
    printf("palidrome no");
 }
 else 
 {
    printf("not palidrome");
 }
 return 0;
}