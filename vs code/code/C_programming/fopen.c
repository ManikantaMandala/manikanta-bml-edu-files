#include <stdio.h>
 unsigned long long pow(int, int);
int main()
{
    int num,power;
    scanf("%d %d",&num,&power);
    unsigned long long ans=pow(num,power);
    printf("%llu",ans);
    return 0;
}

unsigned long long pow(int a,int b){
    if(b==1){
        return a;
    }
    else if(b>1){
        return a*pow(a,b-1);
    }
    else{
        return 1;
    }
}