#include<stdio.h>
int linearFirstOccurance(int arr[],int n, int key){
	for(int i=0;i<n;i++){
		if(arr[i]==key){
			return i;
		}
	}
	return -1;
}
int linearLastOccurance(int arr[],int n, int key){
	for(int i=n-1;i>0;i--){
		if(arr[i]==key){
			return i;
		}
	}
	return -1;
}
int binaryFirstOccurance(int arr[],int n,int key){
	int f=0,l=n-1,mid;
	while(f<=l){
		mid=(f+l)/2;
		if(arr[mid]==key){
			if(arr[mid-1]!=key){
				return mid;
			}
			l=mid-1;
		}
		else if(arr[mid]>key){
			l=mid-1;
		}
		else{
			f=mid+1;
		} 
	}
	return -1;
}
int binaryLastOccurance(int arr[],int n,int key){
	int f=0,l=n-1,mid;
	while(f<=l){
		mid=(f+l)/2;
		if(arr[mid]==key){
			if(arr[mid+1]!=key){
				return mid;
			}
			f=mid+1;
		}
		else if(arr[mid]>key){
			l=mid-1;
		}
		else{
			f=mid+1;
		}
	}
	return -1;
}
int main(){
	int n,first,last,key;

	printf("Enter the size");
	scanf("%d",&n);

	int arr[n];

	printf("Enter the elements in array");
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}

	printf("Enter the key");
	scanf("%d",&key);
	/*
	first=linearFirstOccurance(arr,n,key);
	last=linearLastOccurance(arr,n,key);
	*/
	first=binaryFirstOccurance(arr,n,key);
	last=binaryLastOccurance(arr,n,key);	
	
	printf("[%d,%d]",first,last);
	return 0;
}