#include<stdio.h>
int myshow(int*);
int main(){
    int a=10;
    myshow(&a);
    return 0;
}
int myshow(int*k ){
    printf("%d",*k);
    return 0;
}