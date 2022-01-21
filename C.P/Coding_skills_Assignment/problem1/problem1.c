#include<stdio.h>
int main(){
	FILE	*fpt1,*fpt;
	int i;
	char ch;
	fpt1=fopen("C:\\Users\\91868\\OneDrive\\Desktop\\Coding_skills_Assignment\\problem1\\Intro.txt","r");
	fpt=fopen("C:\\Users\\91868\\OneDrive\\Desktop\\Coding_skills_Assignment\\problem1\\Intro2.txt","w");
	if(fpt1==NULL){
		printf("File is not opened");
	}
	if(fpt==NULL){
		printf("File is not created or opened");
	}
	else{
		ch=fgetc(fpt1);
		for(i=0;ch!=EOF;i++){
			if(ch>=97&&ch<=122){
				ch=ch-32;
				fputc(ch,fpt);
			}
			else{
				fputc(ch,fpt);
			}
		ch=fgetc(fpt1);
		}
		fclose(fpt);
		fclose(fpt1);
	}
	return 0;
}