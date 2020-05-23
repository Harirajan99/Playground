#include<iostream>
using namespace std;
int main()
{
  int a,b,c=0,i,j;
  cin>>a>>b;
  for(i=a;i<b;i++)
  {
    for(j=1;j<i;j++)
    {
      if(i%j==0)
      {
        c=c+j;
      }
    }
    if(i==c)
      cout<<i<<" ";
    c=0;
  }
}
