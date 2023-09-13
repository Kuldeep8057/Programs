#include<stdio.h>
int main()
{
    int i,j,k;
    char ch='A';
    for(i=0;i<=3;i++)
    {
        for(j=0;j<=i;j++)
        {
            printf(" %d",ch);
        }
        printf("\n");
    }
    printf("\n");
    
    //int i,j,k;
    for (i=0;i>=4;i++)
    {
        for(k=5;k>i;k--)
        {
        printf(" ");
        }
    }
    {
        for(j=0;j<=i;j++)
        {printf("*");
        }
    return 0;
}