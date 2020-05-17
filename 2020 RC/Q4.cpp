//time limit exceeded for set 1

#include <iostream>
#include <stdio.h>
#include <sstream>
#include <cstring>
#include <string>
#include <cmath>

using namespace std;

long N, O , A[200001];
long Q(int i, int j){
    long sum=0;
    for(int a=i;a<j;a++){
        sum+=pow(-1, a-i)*A[a]*(a-i+1);
    }
    return sum;
}

void U(int i , int j){
    A[i]=j;
}
long solve(){
    char opt;
    int i,j;
    long ans=0;
    for(int a=0; a< O ; a++){
        cin>>opt>>i>>j;
        if(opt=='Q'){
            ans+=Q(i-1, j);
        }
        else{
            U(i-1,j);
        }
    }
    return ans;
}

int main() {
    ios::sync_with_stdio(false);
    int caseNum;
    cin>>caseNum;
    for(int i = 1 ; i <= caseNum ; i++){
        cin>>N>>O;
        for(int j = 0 ; j < N ; j++){
            cin>>A[j];
        }
        cout<<"Case #"<<i<<": "<<solve()<<endl;
    }
    return 0;
}