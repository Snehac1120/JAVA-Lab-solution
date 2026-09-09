//sum of even no. in 1D array
#include<stdio.h>
void main(){
    int n;
    printf("enter n");
    scanf("%d",&n);
    int a[n];
    int i=0;
    int sum=0;
    for(i=0;i<n;i++){
        printf("enter any no");
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        if(a[i]%2==0){
            sum=sum+a[i];
        }
    }
    printf("%d",sum);
}