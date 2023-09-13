#include<stdio.h>
int main()
{
    int n,no,last,sum=0;
    printf("enter handsome number: ");
    scanf("%d",&n);
    no=n;
    last=n%10;
    n/=10;
    while(n>0)
    {
      sum=sum+n%10;
        n/=10;
    }
    printf("%d",sum);
    if(sum==last){
    printf("%d is handsome number",n);
    }
    else
    printf("no is not handsome");
 return 0;
}