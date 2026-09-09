#include<stdio.h>
void main(){
    int n;
    printf("enter n");
    scanf("%d",&n);
    int i=1,j=1;
    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            printf(" ");
        }
        for(j=1;j<=2*i-1;j++){
            if(j%2!=0){
            printf("*");}
            else{
                printf(" ");
            }
            }
                printf("\n");
        }
        
    }
