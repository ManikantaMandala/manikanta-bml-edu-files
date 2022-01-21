#include<stdio.h>
int main()
{
	FILE *fp1,*fp2;
	int i,a=1;
	char arr[50];
	char ch;
	fp1=fopen("C:\\Users\\91868\\OneDrive\\Desktop\\mani.txt","r");
	fp2=fopen("C:\\Users\\91868\\OneDrive\\Desktop\\Intro2.txt","w");
	
	if(fp1==NULL){
		printf("Cannot open the file ");
	}
	if(fp2==NULL)
	{
		printf("Cannot open the file");
	}
	else
	{
		ch=fgetc(fp1);
		for(i=0;ch!=EOF;i++)
		{
			printf("%c",ch);
			arr[i]=ch;
			a++;
			
			ch=fgetc(fp1);
		}
		for(i=(a-1);i>=0;i--)
		{
			ch=arr[i];
			fputc(ch,fp2);
		}
	}
	fclose(fp1);
	fclose(fp2);
	return 0 ;
}
