#include<stdio.h>
int avg ();
int main()
{
    avg();
    return 0;
}
int avg()
{
    int a,b,c;
    printf("enter the number\n");
    scanf("%d%d",&a,&b);
    c=(a+b)/2;
    printf("avg of number:%d",c);


}