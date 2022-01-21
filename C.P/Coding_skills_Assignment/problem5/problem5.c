#include<stdio.h>
#include<stdlib.h>
int main(){
	FILE* fptr;int nline=1;char ch;
	fptr=fopen("C:\\Users\\91868\\OneDrive\\Desktop\\Coding_skills_Assignment\\problem1\\Intro.txt","r");
	if(fptr==NULL){
		printf("File not opened");
		exit(0) ;
	}
	else{
		ch=fgetc(fptr);
		while(ch!=EOF){
			if(ch=='\n'){
				nline++;
			}
			ch=fgetc(fptr);
		}
		printf("number of lines in the text file is %d",nline);
	}
	fclose(fptr);

	return 0;
}