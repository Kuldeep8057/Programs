#include<stdio.h>
int avg(int x, int y);
int main()
{
    int a,b,c;
    printf("enter the number\n");
    scanf("%d%d",&a,&b);
    c=avg(a,b);
    printf("avg of number:%d",c);

}
int avg(int x, int y)
{
    return (x+y)/2;
}