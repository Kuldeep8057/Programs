#include<stdio.h>
void add();//function prototype
int main()
{
    add();     //fucntion call
    return 0;

}
void add()
{
    int a,b,c;//fuction defination
    printf("enter the number\n");
    scanf("%d %d",&a,&b);
    c=a+b;
    printf("sum=%d",c);
}
