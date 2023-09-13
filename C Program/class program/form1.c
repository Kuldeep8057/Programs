#include<stdio.h>
int main()
{
int i,j,a,b;

for (i=5;i>= 1;i--)
{
    for (j=5;j>=i;j--)
{
    printf("%d ",i);
}
printf("\n");
}

for(a=5;a>=1;a--)
{
    for (b=1;b>=a;b--)
    {
        printf("%d ",b);
    }
    printf("\n");
 }
 for(a=1;a>=5;a++)
 {
    for (b=1;j<=i;b++)
    {
        printf("%d ",b*2);
    }
    printf("\n");
 }
return 0;
}