#include<stdio.h>
int main()
{
    int a[3][3],i,j,sum=0,t=0,diagonal=0;
    printf("enter the elment in 3*3 matrix\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("element =[%d] [%d]: ",i,j);
            scanf("%d",&a[i][j]);
            t=t+a[i][j];
            if (i==0||j==2||i==2||j==0)
            {sum=sum+a[i][j];
            }
            if(i==j||i+j==2)
            {diagonal=diagonal+a[i][j];
            }
        }
    }
    printf("\nthe matrix is  :");
    for(i=0;i<3;i++)
    {
        printf("\n");
        for(j=0;j<3;j++)
        printf("%d\t",a[i][j]);
        }   
    printf("\nsum of the matrix element= %d",t);
    printf("\nsum of BOUNDARY element= %d",sum);
    printf("\nsum of diagonal element= %d",diagonal);
    
    return 0;

}