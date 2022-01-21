#include<stdio.h>
int string_len(char *);
int main(){
	char arr[]={"Hi!! My name is Manikanta Mandala"};
	printf("%d",string_len(arr));
	return 0;
}
int string_len(char *arr){
	int count=0;
	while(*arr!='\0'){
		count++;
		arr++;
	}
	return count;
}