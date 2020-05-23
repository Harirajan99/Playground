#include<iostream>
using namespace std;
int main()
{
  int a,b,s=0,i,j,u=1; 
cin>>a>>b; 
int k=b-2; 
int x[a][b]; 
for(i=0;i<a;i++) 
for(j=0;j<b;j++) 
cin>>x[i][j]; 
for(i=0;i<b;i++) 
{ 
s=s+x[0][i]; 
k=i; 
} 
while(k>1) 
{ 
s=s+x[u][k-1]; 
u=u+1; 
k=k-1; 
} 
for(i=0;i<b;i++) 
{ 
s=s+x[a-1][i]; 
} 
cout<<"Sum of Zig-Zag pattern is "<<s; 
  return 0;

  //Type your code here.
}