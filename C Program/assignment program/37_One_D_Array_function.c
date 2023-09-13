#include<stdio.h>
int d(int[]);
int main()
{
    int arr[5],i;
    printf("enter the five value");
    for(i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }
    d(arr);
    return 0;
}
int d(int arr[])
{
    int i,sum=0;
    printf("element array");
    for(i=0;i<5;i++)
    {
        printf("%d",arr[i]);
        sum=sum+arr[i];
    }
    printf("Total=%d",sum);
}