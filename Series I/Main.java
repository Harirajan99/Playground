#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,i;
  cin>>a;
  float b=0.5;
  if(a==1)
    cout<<b;
  else
  { 
    cout<<b<<" ";
    {
      for(i=0;i<(a-1);i++)
      {
        b=b+pow(3,i);
        cout<<b<<" ";
      }
    }
  }
}