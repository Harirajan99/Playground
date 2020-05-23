#include<iostream>
using namespace std;
int main()
{
  int a,b,i,j,max=0; 
cin>>a>>b; 
int x[a][b]; 
for(i=0;i<a;i++) 
for(j=0;j<b;j++) 
cin>>x[i][j]; 
for(i=0;i<b;i++) 
{ 
max=0; 
for(j=0;j<a;j++) 
{ 
if(x[j][i]>max) 
max=x[j][i]; 
} 
cout<<max<<"\n"; 
}
  return 0;
  //Type your code here.
}