#include<iostream>

using namespace std;

int main(){
    unsigned int n,k,i=0,ans=0;
    cin>>n>>k;
    int arr[n];
     if(n<=10^9&&k<=10^7){
        while(i<n){
            cin>>arr[i];
            if(arr[i]%k==0){
                ans++;
            }
            i++;
        }
     }
        cout <<ans;
    
}