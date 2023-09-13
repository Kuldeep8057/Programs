#include<stdio.h>
int add();
int main()
{
    int c;
    c=add();
    printf("sum=%d",c);
    return 0;

}
int add()
{
    int a,b;
    printf("enter two number\n");
    scanf("%d %d",&a,&b);
    return a+b;
}

