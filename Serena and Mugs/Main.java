#include<iostream>
using namespace std;
int main()
{
  int i,a[2],b[2];
  for(i=0;i<2;i++)
    cin>>a[i];
  for(i=0;i<2;i++)
    cin>>b[i];
  int x=a[0];
  int y=b[1]+b[0];
  if(x>=y)
    cout<<"YES";
  else
    cout<<"NO";
 
  //Type your code here.
}