#include<iostream>
using namespace std;
int main()
{
 // Type your code here
 int a,b,i,j;
 cin>>a>>b;
 int x[a][b];
 for(i=0;i<a;i++)
 for(j=0;j<b;j++)
 cin>>x[i][j];
 for(i=0;i<b;i++)
 {
 for(j=0;j<a;j++)
 cout<<x[j][i]<<" ";
 cout<<"\n";
 }
 }