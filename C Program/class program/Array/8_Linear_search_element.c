#include<stdio.h>
int main()
{
    int a[10],i,ele,flag=0;
    printf("enter to element\n");
    for(i=0;i<=9;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("enter searh element\n");
    scanf("%d",&ele);
    for(i=0;i<=9;i++)
    {
        if(a[i]==ele)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
        {
            printf("element is found %d at location %d",ele,i);
        }
        else{
            printf("not found");
        }
    return 0;
}