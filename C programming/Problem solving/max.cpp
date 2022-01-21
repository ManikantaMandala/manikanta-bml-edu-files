#include <stdio.h>
//int max(int num1,int num2){
//	if(num1>num2)
//		return num1;
//	else
//		return num2;
//	return 0;
//}
int main(){
	int a;
	int b,result;
	scanf("%d %d",&a,&b);
	printf("%d,%d\n",a,b);
	printf("%d",max(a,b));
	int max(int num1,int num2)
	{
	if(num1>num2)
		return num1;
	else
		return num2;
	}
	return 0;
}
