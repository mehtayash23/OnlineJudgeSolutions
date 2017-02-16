#include<stdio.h>
int main()
{
    int matrix[100][100];
    int n=0;
    int i=0;
    int j=0;
    int sum=0;
    int sum_2=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&matrix[i][j]);
        }
    }
    i=0;j=0;
    while(i<n)
    {
        sum=sum+matrix[i][j];
        i++;
        j++;
    }
    i=0;j=n-1;
    while(j>=0)
    {
        sum_2=sum_2+matrix[i][j];
        i++;
        j--;
    }
    if(sum_2>=sum)
    {
        printf("%d",sum_2-sum);
    }
    else
    {
        printf("%d",sum-sum_2);
    }
    return 0;
}