#include<stdio.h>
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
void main ()
{
    struct employee emp;
    printf("enter employee information.\n");
    scanf("\n%s\n %s\n %d\n %s",emp.name,emp.add.city,&emp.add.pin,emp.add.phone);
    printf("printing the employee information...");
    printf("name:%s\ncity:%s\npincode:%d\nphone:%s",emp.name,emp.add.city,&emp.add.pin,emp.add.phone);
    
}
