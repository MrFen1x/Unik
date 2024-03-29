#include<iostream> 
using namespace std;
int main () { 
int n,i,k,sum=0,j,cnt=0;
cin>>n; 
for (i=1;i<=n;i++)
for (j=1;j<=n;j++) {
cin>>k; 
sum+=k; 
cnt=sum/2;
} 
cout<<cnt; 
return 0; 
}
