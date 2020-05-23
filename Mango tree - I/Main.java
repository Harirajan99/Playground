#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(((c-1)%b==0 || (c<=b) || ((c%5)==0)))
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}