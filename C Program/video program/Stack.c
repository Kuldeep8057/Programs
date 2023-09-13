#include<stdio.h>
#include<conio.h>
#include<string.h>


int stack[100],n,top,x,i,c;
void push(void);
void pop(void);
void display(void);

int main(){
    int top = -1;
    printf("Enter the size of STack:\n");
    scanf("%d",&n);

    printf("Stack operation using array");
    printf("\n\t 1.push \n\t 2.pop \n\t 3.show \n\t 4.exit");

    do{
        printf("\n Enter the choice:\n");
        scanf("%d",c);
        switch (c)
        {
        case 1:
            push();
            break;

        case 2:
            pop();
            break;

        case 3:
            display();
            break;
        
        case 4:
            printf("EXIT");
            break;
        }
    }

    while(c != 4);
    {
        return 0;
    };

}

void push()
{
    if(top >= n-1)
    {
        printf("stack is overflow\n");
    }
    else{
        printf("Enter the value to be pushed: ");
        scanf("%d",&x);

        top=top + 1;
        stack[top]=x;
    }
}

void pop()
{
    if(top <= n-1)
    {
        printf("stack is underflow\n");
    }
    else{
        printf("\n the  pop element is %d", stack[top] );
        top=top - 1;
        
    }
}

void display()
{
    if(top >= 0)
    {
        printf("\n the element in stack \n");
        for(i=top;i>=0;i--)
        {
            printf("\n stack[%d]-> %d", i,stack[i]);
        }
    }
    else{
        printf("\n the stack is empty");
    }
}
