#include<stdio.h>
void avg();
int main()
{
    avg();
    return 0;

}
void avg()
{
    int i,n;
    printf("enter the range of number \n");
    scanf("%d",&n);
    float a[n],sum=0,avg;
    printf("enter the number\n");
    for(i=0;i<n;i++){
        printf("a[%d]=",i);
        scanf("%f",&a[i]);
        sum=sum+a[i];
        }
    printf("sum of number:%f\n",sum);    
    avg=sum/n;
    printf("avg of number:%f",avg);
}