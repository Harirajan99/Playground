#include<iostream>
using namespace std;
int main()
{
   int a,b,i,j,s;
 cin>>a>>b;
 int x[a][b];
 for(i=0;i<a;i++)
 for(j=0;j<b;j++)
 cin>>x[i][j];
 for(i=0;i<a;i++)
 {
 s=0;
 for(j=0;j<b;j++)
 {
 s=s+x[i][j];
 }
 cout<<s<<"\n"; 
 }

  //Type your code here.
}