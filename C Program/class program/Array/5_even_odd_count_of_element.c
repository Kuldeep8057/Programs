#include<stdio.h>
int main()
{
    int a[5],i,evencount=0,oddcount=0;
    printf("enter your element\n");
    for(i=0;i<=4;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]%2==0)
        {
            printf("%d is even\n",a[i]);
            evencount++;
        }
        else
        {
            printf("%d is odd\n",a[i]);
            oddcount++;
        }
    }
        printf("total count of even elememnt: %d\n",evencount);
        printf("total count of odd element: %d",oddcount);
    
    return 0;
}