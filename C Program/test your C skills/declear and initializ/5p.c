#include<stdio.h>
#include<string.h>
struct student
{
    int rollno;
    char name[15];
};
int main (){
    int i,n;
    struct student st[i];
    printf("enter records of student");
    for(i=0;i<=n;i++){
        printf("\nenter the rollno");
        scanf("%d",&st[i].rollno);
        printf("\nenter the name");
        scanf("%s",&st[i].name);
    }
    printf("\nstudent infomation list");
    for(i=0;i<=n;i++){
    printf("\nrollno:%d,name:%s",st[i].rollno,st[i].name);
        }
    return 0;
    }
