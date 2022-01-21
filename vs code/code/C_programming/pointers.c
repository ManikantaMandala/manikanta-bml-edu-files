#include <stdio.h> 
  
void main() 
{ 
    int i=0; 
    int j=0; 
    
	printf("\n %d %d %d %d", i, ++i, i++, i);   // 2 2 0 2     
	
	printf("\n %d %d %d %d", j, j++, ++j, j); // 2 1 2 2       
    
    //printf( "%d ", i); //0
    //printf( "%d ", ++i); //1
    //printf( "%d ", i++); //1
    //printf( "%d", i); //2
}


//*i=5,**i