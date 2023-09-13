#include<stdio.h>
int main()
{
    int cword=0,cchar=0,i;
    char str[50];
    printf("enter the string:\n");
    gets(str);
    for(i=0;str[i]!=NULL;i++)
    {
        cchar++;
        if(str[i]==' ')
        {
            cword++;
        }
    }
    printf("the number of character=%d\n",cchar);
    printf("the number of word =%d",cword);
    return 0;
}