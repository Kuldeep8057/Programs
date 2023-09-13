#include<stdio.h>
//declaration / prototype
void namaste();
void bonjour();

//fuction call
int main()
{
    printf("enter f for franchn & i for Indian:");
    char ch;
    scanf("%ch",&ch);
    if(ch == 'i'){
        printf("namaste");
    }
    else{
        printf("bonjour");
    }
     return 0;
}

//function definition
void namaste()
{
   printf("namaste");
}
void bonjour()
{
    printf("bonjour");
}
