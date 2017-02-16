#include<stdio.h>
int main()
{
   int i,choc,temp_wrap,wrapper,rem_wrap,temp,flag,test;

   scanf("%d",&test);

   int n[test],c[test],m[test];

   for(i=0;i<test;i++)scanf("%d%*c%d%*c%d",&n[i],&c[i],&m[i]);

   for(i=0;i<test;i++)
   {

    choc=n[i]/c[i];
    wrapper=choc;
    flag=1;
    while(flag!=0&& m[i]!=1)
    {
        if(m[i]<=wrapper)
        {
            temp_wrap=wrapper/m[i];
            rem_wrap=wrapper%m[i];
            temp=temp_wrap+rem_wrap;
            choc=choc+temp_wrap;
            if(temp>=m[i])
            {
                wrapper=temp;
                flag=1;
            }
            else
            {
                flag=0;
            }
        }
        else
        {
         flag=0;
        }

    }
    printf("%d\n",choc);
  }
  return 0;
}