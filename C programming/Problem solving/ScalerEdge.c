#include <stdio.h>
int func(int A){
	int x,y,ans=0,min;
	for(x=1;x<=A;x++){
		for(y=1;y<=A;y++){
			if(x*y>A){
				if(x+y<min && A!=1){
					min=x+y;		
				}
				ans=x+y;
			}
			if(A==1){
	 			return 3;	
				}
			}
		}
		if(ans>min) return min;
		else if(ans<min) return ans;
	}
int main(){
	int A;
	scanf("%d",&A);
	printf("%d",func(A));
	return 0;
}

