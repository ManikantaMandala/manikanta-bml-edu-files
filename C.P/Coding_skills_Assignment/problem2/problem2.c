#include<stdio.h>
#include<stdlib.h>
int main(){
	FILE *fptr,*fptr1; char ch;int i;char arr[50];
	int charctr=1;
	char fname[]={"Intro.txt"};
	fptr=fopen("C:\\Users\\91868\\OneDrive\\Desktop\\Coding_skills_Assignment\\problem2\\Intro.txt","r");
	if(fptr==NULL) {
		printf(" File does not exist or can not be opened."); 
	}
	else {
		ch=fgetc(fptr);
		for(i=0;ch!=EOF;i++) {
			arr[i]=ch;
			charctr++;
			ch=fgetc(fptr);
		}	
	fptr1=fopen("C:\\Users\\91868\\OneDrive\\Desktop\\Coding_skills_Assignment\\problem2\\Intro2.txt","w");
	for(i=(charctr-2);i>=0;i--){
		ch=arr[i];
		fputc(ch,fptr1);
		}
	}	
	fclose(fptr);fclose(fptr1);
	return 0;
}

