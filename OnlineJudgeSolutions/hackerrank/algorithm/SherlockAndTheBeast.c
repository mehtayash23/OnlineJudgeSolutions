#include<stdio.h>

int main()
{
	long int k,x,n[21],test,temp,temp_2,temp_3,count=0,flag=0,n2[20];
	scanf("%ld",&test);
   for(k=0;k<test;k++)
   {
   	scanf("%ld",&n[k]);
   }



 	for(k=0;k<test;k++)
	{  count=0;
      flag=0;
      temp=0;
      temp_2=0;
      temp_3=0;
      n2[k]=n[k];
		if(n[k]%3==0)
   	{
      	for(x=1;x<=n[k];x++)
      	{
      		printf("5");
      	}
      	printf("\n");
         flag=2;
		}
      else
      {
      	while(n[k]>0)
         {
         	count++;
         	n[k]=n[k]-5;
            temp_3=count*5;
            if(n[k]%3==0 && n[k]>0)
            {
            	temp=5*count;
     	 			temp_2=n2[k]-temp;
               if(temp_2%3==0)
               {
            		flag=1;
               	break;
               }
            }

         }
      }
		if(flag!=1 && flag!=2 && n2[k]%5==0)
   	{
			for(x=1;x<=n2[k];x++)
      	{
      		printf("3");
      	}
      	printf("\n");
         flag=3;
      }
      if(flag==1)
   	{
   		temp=5*count;
     	 	temp_2=n2[k]-temp;
   		for(x=1;x<=temp_2;x++)
      	{
      		printf("5");
      	}
			for(x=1;x<=temp;x++)
      	{
      		printf("3");
      	}
      	printf("\n");
      }
      if(flag==0)
      {
      	printf("-1\n");
      }

	}

	
  	return 0;
}