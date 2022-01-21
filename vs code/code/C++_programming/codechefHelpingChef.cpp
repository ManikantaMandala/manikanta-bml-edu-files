#include<iostream>
using namespace std;
int main(){
    int n,i;
    cin>>n;
    int arr[n];
    while(i<n){
        cin>>arr[i];
        if(arr[i]<10)
            arr[i]=1;
        else
            arr[i]=-1;
        i++;
    }
    i=0;
    while(i<n){
        if(arr[i]==-1)
            cout<<"-1\n";
        else
            cout<<"Thanks for helping Chef!\n";
        i++;
    }
    return 0;
}