#include <stdio.h>
void rever(int *,int );
int main()
{
   int n;
   scanf("%d",&n);
   int arr[n];
   int i;
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    rever(arr,n);
    for(i=0;i<n;i++){
        printf("%d",arr[i]);
    }
    return 0;
}
void rever(int arr[],int n){
    int firs,last;
    int i;
    int *p=arr;
    for(i=0;i<n/2;i++){
        firs=*(p+i);
        last=*(p+n-1-i);
        *(p+i)=last;
        *(p+n-1-i)=firs;
    }
    
}
//int *p
//p=array
//*p+i