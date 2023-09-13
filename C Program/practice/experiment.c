#include<stdio.h>
int main()
{
    int i,n,t,j,first,last,middle,search,a[100];
   printf("Enter the value of N \n");
        scanf("%d", &n);
 
        printf("Enter the numbers \n");
        for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("enter value to find\n");
    scanf("%d",&search);
        
 
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
            printf("\n");
    
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
            {
                last = middle -1;
            }    
        middle=(first +last)/2;
    }
    if(first >last)
    {printf("not found %d is not present in this list\n",search);
    }
    return 0;
}