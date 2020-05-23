#include<iostream>
using namespace std;
int main()
{
  int n,i,c;
  cin>>n;
  int a=-1;
  int b=1;
  for(i=0;i<n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<c;
  
 
  //Type your code here.
}