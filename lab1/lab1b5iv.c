#include<stdio.h>
void main(){
    int n;
    printf("enter n");
    scanf("%d",&n);
    int i,j;
    for(i=n;i!=0;i--){
        for(j=1;j<=n-i;j++){
            printf(" ");
        }
         for(j=1;j<=i;j++){
            if(i%2==0){
                printf(" #");
            }
            else{
                printf(" *");
            }
            }
                printf("\n");
        }
        
    }