#include<stdio.h>
int main(){
	int i;
	char s;
	scanf("%d,%c",&i,&s);
	switch (s){
		case 1:{
			printf("i value is 1");
			break;
		}
		case 2:{
			printf("i value is 2");
			break;
		}
		default:{
			printf("Its default");
			break;
		}
	}
	return 0;
}
