#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
    char arr[10];
    char str[100];
    int h1,h2,m1,m2,s1,s2;
    char a1[10],a2[10],a3[10],a4[10];
    int b;
    int i=0;
    for(i=0;i<=9;i++)
    {
        scanf("%c",&arr[i]);
    }
    strcpy(str,arr);
    sscanf(str,"%d%c%d%c%d%c%c",&h1,a1,&m1,a2,&s1,&s2,a3,a4);
    if(arr[8]=='P' || arr[8]=='p')
    {
        if(h1<12)
        {
            printf("%d",h1+12);
            for(i=2;i<=7;i++)
            {
                printf("%c",arr[i]);
            }
        }
        else if(h1==12)
        {
            printf("%d",h1);
            for(i=2;i<=7;i++)
            {
                printf("%c",arr[i]);
            }
        }
    }
    else if(arr[8]=='A' || arr[8]=='a')
    {
        if(h1==12)
        {
            arr[0]='0';
            arr[1]='0';
            for(i=0;i<=7;i++)
            {
                printf("%c",arr[i]);
            }
        }
        else if(h1<12)
        {
            if(h1<10)
            {
                arr[0]='0';
            }
            printf("%c",arr[0]);
            printf("%d",h1);
            for(i=2;i<=7;i++)
            {
                printf("%c",arr[i]);
            }
        }
    }
    return 0;
}