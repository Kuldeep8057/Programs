#include<stdio.h>
void add(int x,int y);
int main()
{
    int a,b,c;
    printf("enter the number\n");
    scanf("%d %d",&a,&b);
    add(a,b);
    return 0;

}
void add(int x,int y)
{
    int z;
    z=x+y;
    printf("sum=%d",z);
}
