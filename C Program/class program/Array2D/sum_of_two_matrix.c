#include<stdio.h>
int main()
{
    int A[10][10],B[10][10],sum[10][10],i,j,p,q,m,n;
    printf("enter the row and col size of first matrix A\n");
    scanf("%d%d",&m,&n);
    printf("enter the row and col size of second matrix B\n");
    scanf("%d%d",&p,&q);
if (m==p && n==q)
        {
            printf("matrix can be added");
        }
    else
        {
            printf("matrix can not be added");
        }
    printf("\nenter element of matrix of A");
        for(i=0;i<=m;i++)
            {
            for(j=0;j<=n;j++)
                {
                    printf("enter a[%d][%d]=",m,n);
                    scanf("%d",&A[i][j]);
                }
            }
    printf("enter element of matrix of B\n");
        for(i=0;i<=p;i++)
            {
            for(j=0;j<=q;j++)
                {
                    printf("enter a[%d][%d]=",p,q);
                    scanf("%d",&B[i][j]);
                }
            } 
        printf("\nMatrix A\n");     
            for(i=0;i<=m;i++)
                {printf("\n");
                    for(j=0;j<=n;j++)
                    printf("  %d",A[i][j]);
                }    
        printf("\nMatrix B\n");     
            for(i=0;i<=p;i++)
                    {printf("\n");
                    for(j=0;j<=q;j++)
                    printf("  %d",B[i][j]);
                    }
        for(i=0;i<=m;i++)
                {for(j=0;j<=n;j++)
                sum[i][j]=A[i][j]+B[i][j];
                }
            printf("\nMatrix Sum");
            for(i=0;i<=m;i++)
                {printf("\n");
                    for(j=0;j<=n;j++)
                    printf("  %d",sum[i][j]);
                }    

            
    return 0;
}