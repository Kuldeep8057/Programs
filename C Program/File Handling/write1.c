#include<stdio.h>
#include<stdlib.h>
int main()
{
    int text;
    FILE *fptr;
    fptr=fopen("test.txt","w+");
    if(fptr==NULL)
    printf("error");
    exit(1);
    printf("enter the text");
    scanf("%d",&text);
    fprintf(fptr,"%d",text);
    fclose(fptr);
}