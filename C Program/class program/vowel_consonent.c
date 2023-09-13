#include<stdio.h>
int main()
{
    char ch;
    printf("Enter any character:\n");
    scanf("%c",&ch);

    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        printf("Character is vowel");
    }
    else
    {
        printf("Character is consonent");
    }
    return 0;
}
