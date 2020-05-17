#include <iostream>
#include <stdio.h>
#include <sstream>
#include <cstring>
#include <string>
#include <cmath>

using namespace std;

int N,K,A[200000001];
int solve(){
    int found=0,prev=0,a=0;
    bool start=0;
    for(int i = N-1 ; i >= 0 ; i--){
        if(A[i]==1){
            start=1;
            a=0;
        }else if(start){
            if(A[i]==prev+1){
                a++;
            }else{
                start=0;
                a=0;
            }
            if(a==K-1){
                start=0;
                found++;
                a=0;
            }
        }
        prev=A[i];
    }
    return found;
}

int main() {
    int caseNum;
    cin>>caseNum;
    for(int i = 1 ; i <= caseNum ; i++){
        cin>>N>>K;
        for(int i = 0 ; i < N ; i++){
            cin>>A[i];
        }
        cout<<"Case #"<<i<<": "<<solve()<<endl;
    }
    return 0;
}

