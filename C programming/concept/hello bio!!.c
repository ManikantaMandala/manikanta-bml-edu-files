#include<stdio.h>
int main(){
	int N,M,i,j;
	scanf("%d %d",&N,&M);
	int arr[N][M];
	for(i=0;i<N;i++){
		for(j=0;j<M;j++){
			scanf("%d",&arr[N][M]);
		}
	}
	printf("\n");
	for(j=0;j<M;j++){
		for(i=0;i<N;i++){
			printf("%d ",arr[N][M]);
		}
		printf("\n");
	}
	return 0;
}
/*
input:
3 5
1 45 3 4 5
2 6 7 8 9
3 78 12 7 6
output:
1 2 3 
45 6 78
3 7 12
4 8 7
5 9 6
*/

//worst-case time complexity O(M*N)
//space complexity (M*N+4)*4 bytes
 