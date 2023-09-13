#include<stdio.h>
int main()
{
    int a[10],i,sum=0;
    printf("enter the element:-\n");
    for (i=0;i<=9;i++)
    {
        printf("a[%d]=",i);
        scanf("%d",&a[i]);
        sum=sum + a[i];
    }
    printf("sum of array element are %d",sum);
    return 0;
}