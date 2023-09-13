#include <stdio.h>

int main() {

    int n1, n2, max,i;

    printf("Enter two positive integers: ");
    scanf("%d %d", &n1, &n2);

    
    max = (n1 > n2) ? n1 : n2;

    for(i=max;i>=max;i++)
    {
        if (i%n1==0 && i%n2==0)
        {
            break;
        }   
    }
    printf("Lcm of %d and %d is %d",n1,n2,i);
    return 0;
}