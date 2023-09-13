#include<stdio.h>
int main()
{
    int i,j,t=1;
    for (i=5;i>=1;i--){
        for(j=5;j>=i;j--){
            printf(" %d",i);
        }
        printf("\n");
    }
    printf("\n");
    for (i=i;i<=5;i++){
        for(j=1;j<=i;j++){
            printf(" %d",j*2);
        }
        printf("\n");
    }
    printf("\n");
    for (i=1;i<=5;i++)
        {
        for(j=1;j<=i;j++){
            printf(" %d",2*(i-1)+t);
            t=t+1;
            
        }
        printf("\n");
    }
    printf("\n");
    for (i=1;i<=5;i++)
        t=i-1;{
        for(j=1;j<=i;j++){
            printf(" %d",t+i);
            t=t+2;
        }
        printf("\n");
    }
    return 0;
}