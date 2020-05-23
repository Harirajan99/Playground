#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k=0,u,v,o;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=0;j<i;j++)
    {
      if(k<j)
      {
        cout<<"*";
        k++;
      }
      cout<<i;
    }
    cout<<"\n";
    k=0;
  }
  for(u=n;u>=0;u--)
  {
    o=u;
    for(v=0;v<u;v++)
    {
      cout<<u;
      if(u>(v+1))
         {
        cout<<"*";
        k++;
      }
    }
    if(u==1)
       break;
       cout<<"\n";
       k=n;
       }
}
       