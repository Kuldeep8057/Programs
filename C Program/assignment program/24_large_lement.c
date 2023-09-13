#include<stdio.h>
int main()
{
    int a[5],i,f_large,s_large; //f-first , s- second
    printf("enter your element\n");
    for(i=0;i<=4;i++)
    {
        printf("a[%d]=",i);
        scanf("%d",&a[i]);
        if(a[i]>f_large)
        {
            s_large=f_large;
            f_large=a[i];
        }   
        else if(a[i]>s_large && a[i]!=f_large)
            {
                s_large=a[i];
            } 
    }
    printf("first largest number from array is %d\n",f_large);
    printf("second largest number from array is %d",s_large);
    
    return 0;
}     