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
for(i=0;i<a;i++) 
{ 
for(j=0;j<b;j++) 
{ 
if(x[i][j]>max) 
max=x[i][j]; 
} 
} 
cout<<"The maximum element is "<<max; 
return 0;
  //Type your code here.
}