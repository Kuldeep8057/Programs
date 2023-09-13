#include<stdio.h>
int sum(int a, int b)
int main()
{
int a,b;
printf("enter two number:");
scanf("%d\n %d",&a,&b);

int s=sum(a,b);
printf("%d",s);
return 0;
}
int sum(int x,int y){
   return x+y;
}