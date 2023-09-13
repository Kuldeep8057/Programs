#include<stdio.h>
int main()
{
    int a[5],i;
    printf("enter your element\n");
    for(i=0;i<=4;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("now element are \n");
    for(i=0;i<=4;i++)
    {
        printf(" %d",a[i]);
    }
    return 0;
}