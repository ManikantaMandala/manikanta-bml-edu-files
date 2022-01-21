#include<stdio.h>
#include<string.h>
int main(){
    int i;
    char result='y';
    char str[20];
    gets(str);
    for(i=0;i<strlen(str)/2;i++){
        if(str[i]!=str[strlen(str)-i-1]){
            result='n';
        }
    }
    switch(result){
        case 'n':
            printf("the given string/number is not a palindrom");
            break;
        default:
            printf("the given string/number is palindrom");
    }
}