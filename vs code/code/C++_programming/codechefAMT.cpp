#include<iostream>

using namespace std;

int main(){
    int wd;
    float amt;
    cin>>wd>>amt;// scanf 
    if(wd<=2000&&wd>0 &&amt<=2000&&amt>0){
        if(wd>amt ||wd%5!=0)
            printf("%.2f",amt);
        else 
            printf("%.2f",amt-wd-.5);
    }
    else {
        printf("%.2f",amt);
    }
}

    