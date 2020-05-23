#include<iostream>
using namespace std;
int main()
{
  int a,b,c,s,i,te;
  cin>>a>>b;
  c=a+b;
  te=c;
  for(i=1;i<c;i++)
  {
    if(c%i==0)
    {
      s=s+i;
    }
  }
  if(te==s)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
  