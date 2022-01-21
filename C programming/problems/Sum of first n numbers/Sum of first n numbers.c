#include<stdio.h>
int sum(int a)
{
	if(a>0)
	{
		return a*(a+1)/2;
	}
	else 
	{
		return 0;
	}
}
int main()
{
	int a;
	printf("enter the number\n");
	scanf("%d",&a);
	printf("the result : %d",sum(a));
}
