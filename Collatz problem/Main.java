#include<iostream>
using namespace std;
int main()
{
  int a,i;
  cin>>a;
  cout<<a<<"\n";
  for(i=0;a!=1;i++)
  {
    if(a%2==0)
      a=a/2;
    else
      a=3*a+1;
    cout<<a<<"\n";
  }
  cout<<i;

  //Type your code here.
}