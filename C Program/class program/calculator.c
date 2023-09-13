#include<stdio.h>
int main()
{
    int a,b;
    char ch;
printf("enter the value of a: ");
scanf("%f",&a);
printf("enter an operator: ");
scanf(" %c",&ch);
printf("enter the value of b: ");
scanf("%f",&b);
    /*switch(ch)
    {
    case '+': 
         printf("%.1f + %.1f=%.1f",a,b,a + b);
         break;
    case '-': 
         printf("%.1f - %.1f=%.1f",a,b,a - b);
    case '*': 
        printf("%.1f * %.1f=%.1f",a,b,a * b);
         break;    
    case '/': 
         printf("%.1f / %.1f=%.1f",a,b,a / b);
         break;
   
    default: ("invalid operation");
        break;
    }*/
    switch (ch)
    {
    case '+': printf("%.1f + %.1f = %.1f",a,b,a+b);
        break;
    case '-': printf("%.1f - %.1f = %.1f",a,b,a-b);
        break;
    case '*': printf("%.1f * %.1f = %e",a,b,a*b);
        break;
    case '/': printf("%.1f / %.1f = %.1f",a,b,a/b);
        break;        
    
    default:printf("not valid operator");
        break;
    }
    return 0;
}