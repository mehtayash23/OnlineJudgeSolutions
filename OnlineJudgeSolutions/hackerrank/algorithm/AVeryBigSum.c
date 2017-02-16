#include<stdio.h>
int main(){
    long long int arr[10];
    long long int sum=0;
    int n=0;
    int i=0;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%lld",&arr[i]);
    }
    for(i=0;i<n;i++){
        sum+=arr[i];
    }
    printf("%lld",sum);
    return 0;
}
