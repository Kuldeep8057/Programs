#include<stdio.h>
int total_mark(int a[]);
int main()
{
    int total=0,mark[]={50,67,87,46,24};
    printf("total mark=%d",total_mark(mark));
    return 0;
}
int total_mark(int a[])
{
    int sum=0,i;
    for (i=1;i<=5;i++)
    sum=sum+a[i];
    return sum;
}
