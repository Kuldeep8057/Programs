#include<stdio.h>
int main()
{
    char c;
    printf("Ques 1: Where is the Taj Mahal?\n");
    printf("  A. Agra \n  B. Delhi\n  C. Kolkata\n  D.Lucknow\n");
    printf("enter your option: ");
    scanf("%c",&c);
    if(c=='A')
    {
        printf("correct answer");
    }
    else if(c=='B')
    {
        printf("incorrect answer");
    }
    else if(c=='C')
    {
        printf("incorrect answer");
    }   
    else if(c=='D')
    {
        printf("incorrect answer");
    }
    else{
        printf("invalid choice");
    }   
       
    

    return 0;
}