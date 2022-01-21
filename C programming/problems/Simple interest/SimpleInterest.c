#include<stdio.h>

int main(){
	float t,p,r,interest;
	printf("enter the value of principle\n");
	scanf("%f",&p);
	printf("enter the value of time\n");
	scanf("%f",&t);
	printf("enter the value of rate\n");
	scanf("%f",&r);
	interest=(p*t*r)/100;
	printf("the interest is :%f",interest);
}

