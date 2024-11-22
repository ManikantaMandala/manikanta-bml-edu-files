#include <stdio.h>
#include <stdlib.h>
#include <time.h>
  
void merge(int arr[], int lb, int mid, int rb) {
    int i, j, k;
    int n1 = mid - lb + 1;
    int n2 = rb - mid;
  
    int LeftSubArr[n1], RightSubArr[n2];
  
    for (i = 0; i < n1; i++)
        LeftSubArr[i] = arr[lb + i];
    for (j = 0; j < n2; j++)
        RightSubArr[j] = arr[mid + 1 + j];
  
    i = 0; 
    j = 0; 
    k = lb; 
    while (i < n1 && j < n2) {
        if (LeftSubArr[i] <= RightSubArr[j]) {
            arr[k] = LeftSubArr[i];
            i++;
        }
        else {
            arr[k] = RightSubArr[j];
            j++;
        }
        k++;
    }
  
    while (i < n1) {
        arr[k] = LeftSubArr[i];
        i++;
        k++;
    }
  
    while (j < n2) {
        arr[k] = RightSubArr[j];
        j++;
        k++;
    }
}
  
void Sort(int arr[], int lb, int rb){
    if (lb < rb) {
        int mid = lb + (rb - lb) / 2;
  
        Sort(arr, lb, mid);
        Sort(arr, mid + 1, rb);
  
        merge(arr, lb, mid, rb);
    }
}
  
int main() {
  int n;
  printf("Enter the size of array ");
  scanf("%d",&n);

  int arr[n];
  printf("Enter the elements in array ");

  for (int i=0; i<n; i++) {
    scanf("%d",&arr[i]);
  }
  
  printf("Given array is \n");
  for (int i=0; i<n; i++) {
    printf("%d ",arr[i]);
  }
  
  clock_t t;
  t = clock();

  Sort(arr, 0, n-1);

  t = clock() -t;

  double time_taken =((double)t)/CLOCKS_PER_SEC;

  printf("\nSorted array is \n");
  for (int i=0; i<n; i++) {
    printf("%d ",arr[i]);
  }

  printf("\n time taken: %f\n", time_taken);

  return 0;
}
