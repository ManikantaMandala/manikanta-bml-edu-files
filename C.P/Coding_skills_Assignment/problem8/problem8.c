#include <stdio.h>

int GCD(int m , int n){
    	int ans=1,i;
   	for(i=2; i<=m && i<=n; i++){
        	if(m%i ==0 && n%i == 0)
            		ans=i;
    	}
    	return ans;
}
int main(){
    	int m , n;
    	printf("Find GCD of m and n = ");
   	scanf("%d %d", &m , &n);
    	printf("\n");
    	printf("GCD of %d and %d = %d", m , n, GCD(m,n));
    	return 0;   
}