#include<stdio.h>
int main()
{
    int a[5],i,sum;
    printf("enter the element\n");
    for (i=0;i<=4;i++)
    {
        printf("a[%d]=",i);
        scanf("%d",&a[i]);
        if(a[i]%2==0)
        sum=sum+a[i];
    }
    printf("sum of array element %d",sum);
    return 0;
}