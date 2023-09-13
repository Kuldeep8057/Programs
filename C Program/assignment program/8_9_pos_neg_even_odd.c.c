#include<stdio.h>
int main()
{
    int a;
    printf("enter number: ");
    scanf("%d",&a);
    /*if (number >= 0){
        printf("postive \n");
        if(number %2 == 0){
            printf("even \n");
        }else {
            printf("odd \n");
        }
    }else {
        printf("negative \n");
    }*/    
    /*if (number >= 0){
        printf("postive \n");
        if(number %2 == 0){
            printf("even \n");
        }else {
            printf("odd \n");
        }
    }else if(number < 0){
        printf("negative \n");
        if(number %2 == 0){
            printf("even \n");
        }else {
            printf("odd \n");
        }
    }else {
        printf("not valid number \n");
     
    }*/
    if(a>=0)
    {
        if (a%2==0){
            printf("%d postive even number",a);
        }
        else {
            printf("%d postive odd number",a);
        }
    }
    else if ( a <0)
    {
     if(a%2==0)
     {
        printf("%d is negative even number",a);
     }
     else{
        printf("%d is negative odd number",a);
     }
    }

  return 0;   
}