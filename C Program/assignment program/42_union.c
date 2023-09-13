#include<stdio.h>
#include<stdlib.h>

    union employee
    {
        char name[30];
        int id;
        int salary;
    };
int main()
{
    int n=2,i;
    union employee emp[n];
    printf("enter the %d employee detail\n\n",n);
    for(i=0;i<n;i++)
{
    printf("employee %d\n",i+1);
    printf("Name:-");
    scanf("%[^\n]s",&emp[i].name);
    printf("Id:-");
    scanf("%d",&emp[i].id);
    printf("Salary:-");
    scanf("%d",&emp[i].salary);
    char ch=getchar();
    
    printf("\n");
}
    printf("................All employee detail....................\n");
    for (i=0;i<n;i++)
    {
        printf("Name:\t %s\n",emp[i].name);
        //printf("%s\n",&emp[i].name);
        printf("Id:\t%d\n",emp[i].id);
        //printf("%d\n",&emp[i].id);
        printf("Salary:\t%d\n",emp[i].salary);
        //printf("%d\n",&emp[i].salary);
    }
    return 0;
}