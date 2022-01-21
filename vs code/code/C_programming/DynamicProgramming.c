#include <stdio.h>
#include<stdlib.h>

int main()
{
    int i,*p,n;
    scanf("%d",&n);
    p=(int *)malloc(n*sizeof(int));
    // p=(int *)calloc(n,sizeof(int));
    for(i=0;i<n;i++)
        *(p+i)=n;
    for(i=0;i<n;i++)
        printf("%d at %p \n",*(p+i),p+i);
    // p=realloc(p,5);
    // for(i=0;i<n;i++)
    //     *(p+i)=n;
    // for(i=0;i<n;i++)
    //     printf("%d at %p",*p+i,p+i);
    //free(p)
    return 0;
}