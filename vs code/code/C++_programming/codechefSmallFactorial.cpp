#include<iostream>
using namespace std;
void smallFact(int*);
int n;
int main(){
    int arr[n];
    int*p;
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>arr[i];
    smallFact(arr);
    for(int i=0;i<n;i++)
        cout<<arr[i];
}
void smallFact(int arr[]){
    for(int i=0;i<n;i++)
        for(int j= arr[i]-1;j>0;j--)
            arr[i] = arr[i] * j;
    // return arr;
}
