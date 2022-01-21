#include <stdio.h>
int max(int a,int b,int c){
    if(a>b &&a>c){
        printf("%d",a);
    }
    else if(b>a && b>c){
        return b;
    }
    else{
        return c;
    }
}

int main()
{
    int i,j, c;
    printf("enter the values");
    scanf(" %d,%d,%d",&i,&j,&c);
    printf("%d",max(i,j,c));
    
    
    return 0;
}
