#include<iostream>
using namespace std;
int main()
{
  int a,b,i,j; 
cin>>a>>b; 
int x[a][b],y[a][b]; 
for(i=0;i<a;i++) 
for(j=0;j<b;j++) 
cin>>x[i][j]; 
for(i=0;i<a;i++) 
for(j=0;j<b;j++) 
cin>>y[i][j]; 
for(i=0;i<a;i++){ 
for(j=0;j<b;j++) 
cout<<(x[i][j]+y[i][j])<<" "; 
cout<<"\n"; 
}
return 0;
  //Type your code here.
}