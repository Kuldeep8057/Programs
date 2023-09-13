#include<stdio.h>
int main()
{
    int i,n,t,j,a[100];
    printf("Enter the value of N \n");
        scanf("%d", &n);
    printf("Enter the numbers \n");
        for(i=0;i<n;i++)
        {
            printf("a[%d]=",i);
            scanf("%d",&a[i]);
        }
    //printf("enter value to find\n");
    //scanf("%d",&search);
for (i = 0; i < n; ++i) 
        {
for (j = i + 1; j < n; ++j)
            {
if (a[i] > a[j]) 
                {
 
                    t =  a[i];
                    a[i] = a[j];
                    a[j] = t;
 
                }
 
            }
 
        }
 
        printf("The numbers arranged in ascending order are given below \n");
        for (i = 0; i < n; ++i)
            {
                printf(" %d", a[i]);
            }
    return 0;
}