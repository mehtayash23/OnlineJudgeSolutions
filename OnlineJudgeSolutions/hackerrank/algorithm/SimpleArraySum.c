#include<stdio.h>
int main()
{
    int n;
    int sum=0;
    int i=0;
    int Arr[3000];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&Arr[i]);
    }
    for(i=0;i<n;i++)
    {
        sum=sum+Arr[i];
    }
    printf("%d",sum);
    return 0;
}