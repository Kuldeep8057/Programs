#include<stdio.h>
void change();
int main()
{
    int a=10;
    change(a);
    printf("%d",&a);
    
}
void change(int a){
a=a+5;
printf("%d",a);
}