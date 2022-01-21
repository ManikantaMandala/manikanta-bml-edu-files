#include<stdio.h>
//int swap(int*x,int*y);//prototype of call by reference;always remember that pointers are used to define the address
//int swap(int x,int y);//prototype of call by value;always remember that identifier is used for call by value not address
int main(){
	int a,b;
	scanf("%d %d",&a,&b);
	swap(&a,&b);
	printf("%d %d",a,b);
	return 0;
}
//int swap(int* x,int* y){//call by reference
//	int t;
//	t=*x;
//	*x=*y;
//	*y=t;
//}
int swap(int x,int y){//call by value
	int t;
	t=x;
	x=y;
	y=t;
}
