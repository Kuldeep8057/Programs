#include<stdio.h>
int main()
{
    int a=0,b=1,c,n,i=0;
    printf("enter the range:- ");
    scanf("%d",&n);
    printf("%d\n%d\n",a,b);
    
    c=a+b;

    while (i<=n-3)
    {
        printf("%d\n",c);
        a=b;
        b=c;
        c=a+b;
        
        i++;
    }
    
    return 0;
    
}