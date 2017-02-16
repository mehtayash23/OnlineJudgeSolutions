#include<stdio.h>
int main()
{
    int Arr[100];
    int i=0;
    int n=0;
    int countPositive=0;
    int countNegative=0;
    int countZero=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&Arr[i]);
    }
    for(i=0;i<n;i++)
    {
        if(Arr[i]>0)
        {
            countPositive=countPositive+1;
        }
        else if(Arr[i]==0)
        {
            countZero=countZero+1;
        }
        else
        {
            countNegative=countNegative+1;
        }
    }
    printf("%f\n",(float)countPositive/n);
    printf("%f\n",(float)countNegative/n);
    printf("%f",(float)countZero/n);
    return 0;
}