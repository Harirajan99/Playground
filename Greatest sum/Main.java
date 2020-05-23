#include<iostream>
using namespace std;
int main()
{
   int a,b,i,j,f,k,max_row=0,max_col=0,s=0,t=0;
 cin>>a>>b;
 int x[a][b];
 for(i=0;i<a;i++)
 for(j=0;j<b;j++)
 cin>>x[i][j];
 cout<<"Sum of rows is";
 for(i=0;i<a;i++)
 {
 s=0;
 for(j=0;j<b;j++)
 {
 s=s+x[i][j];
 }
 cout<<" "<<s;
 if(s>max_row)
 {
 max_row=s;
 f=i+1;
 }
 }
 cout<<"\n"<<"Row "<<f<<" has maximum sum";
 cout<<"\n"<<"Sum of columns is";
 for(i=0;i<b;i++)
 {
 t=0;
 for(j=0;j<a;j++)
 {
 t=t+x[j][i];
 }
 cout<<" "<<t;
 if(t>max_col){
 max_col=t;
 k=i+1;
 }
 }
 cout<<"\n"<<"Column "<<k<<" has maximum sum";
}
  //Type your code here.
