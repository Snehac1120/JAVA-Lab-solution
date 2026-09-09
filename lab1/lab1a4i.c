#include<stdio.h>
void main(){
    int n;
    printf("enter n");
    scanf("%d",&n);
    int i=0,j=0;
    for(i=0;i<=n;i++){
        for(j=0;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}