//Sir can you check it and In which part can I improve
#include<stdio.h>
#include <stdlib.h>
int dice(){     //dice function with random lib.
	int y= rand() % 6 +1;
	printf(" By rolling the dice,the value is %d and ",y);
	return y;  
}
int snakesAndLadders(int y){     //position and the output when the position of a player is Snake or ladder.
	int inpu[17]={4,9,20,25,28,3336,42,51,56,59,62,69,71,83,91,94,99};  // positions of snakes and Ladder.
	int func[17]={14,31,38,3,84,44,63,67,48,1,81,32,90,57,73,26,80};  // Ending position of snakes and Ladders
	for(int i=0;i<17;i++){
		if(y==inpu[i]){       //Checking whether it the position is snake or ladder
			if(i==3||i==8||i==9||i==11||i==13||i==14||i==15||i==16){       //if it is a snake
				printf("No God! please no...!!!    ");
			}
			else{	
				printf("Yeah boi!!!    ");	   //if it is a ladder
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
	scanf("%d",&n);    //taking no of players
	int p[n];          //Creating the spaces for players
	for(int i=0;i<n;i++){
		p[i]=0;        //assigning zero position for starting.
	}
	for(;;){           //implimenting infinite loop
		int i;
		for( i=0;i<n;i++){    //Assigning the the position by rolling the dice
			scanf("%c",&ok);
			int y= dice();   // dice rolling	
			if(p[i]+y<=100){
				p[i]+=y;     //checking whether the player is winner and adding the dice value.
			}
			
			p[i]=snakesAndLadders(p[i]);   //checking whether the position is snake or ladder using snakesAndLadders function
			printf("position of player %d is %d  ",i+1,p[i]);    //printing position of the player.
			if(p[i]==100){
				break;      //checking if the player is winner or not.
			}
			if(i==n-1){
				break;   //rotation of chances for players
			}
		}
		if(p[i]==100){
			printf("\nthe winners is player %d",i+1);     // Printing the Winner
			break;
		}
	}
}


