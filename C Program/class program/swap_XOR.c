#include<stdio.h>
int main()
{
    int a=5,b=4;
    a=a^b;
    printf("\n%d\n",a);
    b=a^b;
    printf("\n%d\n",a);
    a=a^b;
    
    printf("value of a=%d and b=%d:",a,b);

    return 0;
}