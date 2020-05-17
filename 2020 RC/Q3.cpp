//time limit exceeded for set 2

#include <iostream>
#include <stdio.h>
#include <sstream>
#include <cstring>
#include <string>
#include <cmath>

using namespace std;

int N,data[100000],sum=0;
int solve(){
    int a, found = 0 ;
    for(int i = 0 ; i < N ; i ++){
        a=sum;
        if(fmod(sqrt(a), 1)==0)
            found++;
        for(int j = N-1 ; j >=i+1 ; j --){
            a-=data[j];
            if(fmod(sqrt(a), 1)==0)
            found++;
        }
        sum-=data[i];
    }
    return found;
}

int main() {
    ios::sync_with_stdio(false);
    int caseNum;
    cin>>caseNum;
    for(int i = 1 ; i <= caseNum ; i++){
        cin>>N;
        for(int i = 0 ; i < N ; i++){
            cin>>data[i];
            sum+=data[i];
        }
        cout<<"Case #"<<i<<": "<<solve()<<endl;
    }
    return 0;
}
