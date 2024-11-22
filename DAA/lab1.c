//{{{class="brush: clang" 
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void swap(int*a , int*b); //swap function
void quickSort(int arr[], int low, int high); //quick-sort function
int partition(int arr[], int low, int high); 
void printArray(int arr[], int n);
int main (){
  int n;
  printf("Enter the size of the array:\n");
  scanf("%d",&n);

  int arr[n];

  for (int i = 0; i < n; i++) {
    arr[i]=rand()%100;
  }

  printArray(arr, n);

  clock_t t;
  t = clock();

  quickSort(arr, 0, n-1);

  t = clock() -t;
  double time_taken =((double)t)/CLOCKS_PER_SEC;

  printf("\nThe solution:\n");
  printArray(arr, n);

  printf("\n time taken: %f", time_taken);
  return 0;
}

void quickSort(int arr[], int low, int high){
  if (low<high) {
    int pi = partition(arr, low, high);

    quickSort(arr, low, pi-1);
    quickSort(arr, pi+1, high);
  }
}

int partition(int arr[], int low, int high){
  int pivot = arr[high];
  int i =(low-1);

  for (int j = low; j <= high-1; j++) {
    if (arr[j]<pivot) {
      i++;
      swap(&arr[i],&arr[j]);
    }
  }
  swap(&arr[i+1], &arr[high]);
  return i+1;
} 

void swap(int*a , int*b){
  int t = *a;
  *a = *b;
  *b = t;
}

void printArray(int arr[], int n){
  for (int i = 0; i < n; i++) {
    printf("%d ",arr[i]);
  }
  printf("\n");
}
//}}}
