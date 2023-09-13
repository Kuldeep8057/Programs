#include<stdio.h>
int main()
{
    int i,first,last,middle,n,search,a[100];// i, j, t, n, a[30];
    printf("ente number of element\n");
    scanf("%d",&n);
    printf("enter %d integers\n",n);
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("enter value to find\n");
    scanf("%d",&search);
    first=0;
    last=n-1;
    middle=(first+last)/2;
    while(first<=last)
    {
        if(a[middle]<search)
        first=middle +1;
        else if (a[middle]==search)
        {
            printf("%d found at location %d \n",search,middle);
            break;
        }
        else 
        last = middle -1;
        middle=(first +last)/2;
    }
    if(first >last)
    {printf("not found %d is not present in this list\n",search);
    }
    return 0;
}