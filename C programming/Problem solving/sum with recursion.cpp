#include <stdio.h>
int func(int n){
	if(n==0) {
		return 0;
	}
		
	else{
		return n+ func(n-1);
	} 
}
//(sum of n numbers)
int main(){
	int sum=0;
	int n;
	printf("Enter the n value\n");
	scanf("%d",&n);
	sum=func(n);	
	printf("%d",sum);
	return 0;
}
