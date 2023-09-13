#include<stdio.h>
int main()
{
    int a,b;
    char ch;
    printf("enter tha value  a\n");
    scanf("%d",&a);
    printf("enter tha operator\n");
    scanf("%c",&ch);
    printf("enter tha value b\n");
    scanf("%d",&b);
    switch (ch)
    {
    case '+':printf("%d + %d=%d",a,b,a+b);
             break;
    case '-':printf("%d - %d=%d",a,b,a-b);
             break;
    case '*':printf("%d * %d=%d",a,b,a*b);
             break;
    case '/':printf("%d / %d=%d",a,b,a/b);
             break;         
    default:printf("wrong number or oprator");
        break;
    }
    
    return 0;
}