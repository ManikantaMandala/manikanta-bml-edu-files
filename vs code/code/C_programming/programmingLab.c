#include<stdio.h>
#include<math.h>
//prime number
char prime(int);
int main(){
    int n;
    char result;
    printf("Enter the Number ");
    scanf("%d",&n);
    result=prime(n);
    switch(result){
        case 'y':
            printf("the number is prime number");
            break;
        default:
            printf("the number is not a prime number");
    }
    return 0;
}
char prime(int x) {
    int sqr= sqrt(x),i;
    for(i=2;i<=sqr+1;i++){
        if(x%i==0){
            return 'n';
        }
        else {
            break;
        }
    }
    return 'y';
}
