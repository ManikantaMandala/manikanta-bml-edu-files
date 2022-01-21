#include<stdio.h>
#include<string.h>
int main(){
	char arr[]={"INDIA"};int i;
	for(i=0;i<strlen(arr);i++){
		arr[i]=arr[i]+2;
	}
	puts(arr);
	return 0;
}