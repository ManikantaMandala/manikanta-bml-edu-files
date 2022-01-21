#include<stdio.h>
int main(){
	int a,result;
	scanf("%d",&a);
	if(a<60)
		result=1;
	else if (a>60 && a<80)
		result=2;
	switch(result){
		case 1:
			printf("less than 50 and 1st division");
		
		default:
			printf("Greater than 80 and 3rd division");
			break;
		case 2:
			printf("between 60 and 50 and 2nd division");
			
	}
}
