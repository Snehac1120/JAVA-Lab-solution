#include<stdio.h>
#include<string.h>
void main(){
    char a[10];
    int i,j,n;
    printf("enter a string:");
    scanf("%s",a);
    printf("%s",a);
    printf("\n");
    n=strlen(a);
    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            printf(" ");
        }
        for(j=1;j<=2*i-1;j++){
            if(j%2!=0){
            printf("%c",a[j]);}
            else{
                printf(" ");
            }
            }
                printf("\n");
        }
    }
