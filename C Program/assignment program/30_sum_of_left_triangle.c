#include<stdio.h>
int main()
{
    int a[3][3],i,j,sum=0,t=0;
    printf("enter the elment in 3*3 matrix\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("element =[%d] [%d]: ",i,j);
            scanf("%d",&a[i][j]);
            t=t+a[i][j];
            if (i>=j)
            sum=sum+a[i][j];
        }
    }
   
    
    printf("\nthe matrix is  :");
    for(i=0;i<3;i++)
    {
        printf("\n");
        for(j=0;j<3;j++)
        printf("%d\t",a[i][j]);
        
    }   
    printf("\n sum of the matrix element= %d",t);
    
    printf("\n sum of left triangle element= %d",sum);
    printf("\n");

    return 0;

}