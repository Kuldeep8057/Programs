#include<stdio.h>
int main()
{
    int a[5]={10,20,32,33,24}; //fully initialization
    int d[5]={32,5,4,23,22}; //partial initialization
    int c[]={45,5,3,6,7};
    // int a[]; initialization is wrong 
    int b[5];
    b[0]=10;
    b[1]=20;
    b[2]=30;
    b[3]=40;
    b[4]=50;

    return 0;
}