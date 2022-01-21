#include<stdio.h>
#include<stdlib.h>
int sum(int);
int i;
int main(){
	int n;
	printf("Enter the number of numbers should be added ");
	scanf("%d",&n);
	i=n+1;
	printf("\n the sum of the first %d numbers is %d",n,sum(n));
	return 0;	
}
int sum(int n){
	if(n==1){
		printf(" %d ",i-n);
		return 1;
	}
	else{
		printf(" %d ",i-n);
		return n+sum(n-1);
	}
}