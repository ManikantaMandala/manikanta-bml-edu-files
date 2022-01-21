#include<stdio.h>
int main(){
	int n;
	printf("Enter the order of the square matrix to be created: ");
	scanf("%d",&n);
	int arr[n][n];
	int i,j,d1=0,d2=0;
	for( i=0;i<n;++i){
		for( j=0;j<n;++j){
			scanf("%d",&arr[i][j]);
		}
	}
	for( i=0;i<n;++i){
		if(i%2==0){
			for( j=0;j<n;++j){
				printf("%d ",arr[i][j]);
			}
		}
		else{
			for(j=n-1;j>=0;--j){
				printf("%d ",arr[i][j]);
			}
		}
	}
	for( i=0;i<n;++i){
		for( j=0;j<n;++j){
			if(i==j){
				d1+=arr[i][j];
			}
			else if(i+j==n-1){
				d2+=arr[i][j];
			}
		}
	}
	printf("the difference of the diagonals is %d",d1-d2);
}

