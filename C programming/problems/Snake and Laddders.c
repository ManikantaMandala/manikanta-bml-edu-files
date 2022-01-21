//Sir can you check it and In which part can I improve
#include<stdio.h>
#include <stdlib.h>
int dice(){
	int y= rand() % 6 +1;
	printf(" %d ",y);
	return y;  
}
int snakesAndLadders(int y){
	int inpu[17]={4,9,20,25,28,3336,42,51,56,59,62,69,71,83,91,94,99};
	int func[17]={14,31,38,3,84,44,63,67,48,1,81,32,90,57,73,26,80};
	for(int i=0;i<17;i++){
		if(y==inpu[i]){
			if(i==3||i==8||i==9||i==11||i==13||i==14||i==15||i==16){
				printf("No God! please no...!!!");
			}
			else{	
				printf("Yeah boi!!!");	
			}
			y=func[i];
			}
	
		}
		return y;
	}
	
int main(){
	int n;
	char ok;
	printf("Enter the players ");
	scanf("%d",&n);
	int p[n];
	for(int i=0;i<n;i++){
		p[i]=0;
	}
	for(;;){
		int i;
		for( i=0;i<n;i++){
			scanf("%c",&ok);
			int y= dice();
				
			if(p[i]+y<=100){
				p[i]+=y;
			}
			
			p[i]=snakesAndLadders(p[i]);
			printf("%d of player %d",p[i],i+1);
			if(p[i]==100){
				break;
			}
			if(i==n-1){
				break;
			}
		}
		if(p[i]==100){
			printf("the winners is %d",i+1);
			break;
		}
	}
}


