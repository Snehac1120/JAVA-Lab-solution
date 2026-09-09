//factor of given no
#include<stdio.h>
void main(){
    int n;
    printf("enter n");
    scanf("%d",&n);
    int i=1;
    for(i=1;i<n;i++){
        if(n%i==0){
            printf("Factors are %d",i);
        }
    }
}