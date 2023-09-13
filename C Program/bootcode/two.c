#include<stdio.h>
int main() {
    int p,q,r,s;
    p=1;
    q=2;
    // r=p,q;
    r=10,20;
    s=(p,q);
    // printf("p=%d q =%d",p,q);
    printf("\nr=%d s =%d",r,s);

}

// the comma operator evaluates bth f its operands and produces the value of the second. it also  
