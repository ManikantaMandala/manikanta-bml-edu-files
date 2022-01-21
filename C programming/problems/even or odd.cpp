#include<stdio.h>
int main(){
	char a;
	printf("Enter the number ");
	scanf("%s",&a);
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		printf("the character is an vowel");
	else
		printf("the character is an consonant");

}
