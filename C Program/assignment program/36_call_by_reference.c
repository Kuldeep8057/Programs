#include<stdio.h>
void swap(int *x, int *y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

void main() 
{  
    int x = 50, y = 70;    
    swap(&x, &y);  // passing value to function
    printf("\nValue of x: %d",x);
    printf("\nValue of y: %d",y);
    //return 0;  
}  