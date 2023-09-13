#include<stdio.h>
#include<string.h>
struct address
{
    char city[20];
    int pin;
    char phone[14];
};
struct employee
{
    char name[20];
    struct address add;    
};
int main()
{
    struct employee emp;
    int n;
    printf(" employee infomation\n");
    printf("how many employee=");
    scanf("%d",&n);
    printf("enter the name:");
    scanf("%s",emp.name);
    printf("enter the city:");
    scanf("%s",emp.add.city);
    printf("enter the pin:");
    scanf("%d",&emp.add.pin);
    printf("enter the phone_no:");
    scanf("%s",emp.add.phone);
    
    printf("priting the employee informatio..\n");
    printf("name:%s\ncity:%s\npinode:%d\nphone:%s",emp.name,emp.add.city,emp.add.pin,emp.add.phone);
}
