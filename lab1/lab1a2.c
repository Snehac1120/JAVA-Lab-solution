//sum of numbers entered
#include<stdio.h>
void main(){
    int n;
    printf("enter n");
    scanf("%d",&n);
    int rem=0;
    int sum=0;
    while(n!=0){
    rem=n%10;
    sum=sum+rem;
    n=n/10;}
    printf("%d",sum);
}