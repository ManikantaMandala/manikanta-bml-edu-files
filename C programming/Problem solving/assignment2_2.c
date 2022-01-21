#include<stdio.h>
struct empl{
	char name[20];
	int emplid;
	char dname[30];
	float bsala;
	float nsala;
};
struct empl e[5];
int main(){
	int i;
	for( i=0;i<5;++i){
		printf("\n Enter the name of the employee %d : ",i+1);
	 	gets(e[i].name);
	 	fflush(stdin);
	 	printf("\n Enter the Employee ID number of the employee %d : ",i+1);
	 	scanf("%d", &e[i].emplid);
	 	fflush(stdin);
	 	printf("\n Enter the department name of the employee %d: ",i+1);
	 	gets(e[i].dname);
	 	fflush(stdin);
		printf("\n Enter the basic salary of the employee %d: ",i+1);
	 	scanf("%f", &e[i].bsala);
	 	fflush(stdin);
	 	int hra,da;
	 	if(e[i].bsala>0 && e[i].bsala<=4000){
	 		hra =10;
	 		da=50;
	 	}
		else if(e[i].bsala>4000 && e[i].bsala<=8000){
			hra=20;
			da=60;
		}
		else if(e[i].bsala>8000 && e[i].bsala<=12000){
			hra=25;
			da=70;
		}
		else{
			hra=30;
			da=80;
		}
	 	e[i].nsala=e[i].bsala+(e[i].bsala*hra)+(e[i].bsala*da);
	}
	for( i=0;i<5;++i){
		printf("\nthe name of the employee %d:%s ",i+1,e[i].name);
	 	printf("\nthe Employee ID number of the employee %d: %d",i+1,e[i].emplid);
	 	printf("\nthe department name of the employee %d: %s",i+1,e[i].dname);
		printf("\nthe basic salary of the employee %d: %f",i+1,e[i].bsala);
		printf("\nthe net salary of the employee %d: %f",i+1,e[i].nsala);
	}
}
