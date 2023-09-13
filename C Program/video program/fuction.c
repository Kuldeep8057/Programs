#include<stdio.h>
//declaration / prototype
void printHello();
void printGoodbye();

//fuction call
int main()
{
    printHello();
    printGoodbye();
    return 0;
}

//function definition
void printHello()
{
    printf("Hello\n");
}
void printGoodbye()
{
    printf("Goodbye\n");
}