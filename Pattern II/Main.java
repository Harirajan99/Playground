#include<iostream>
using namespace std;
int main()
{
  int n,c=0,i,d,k=0;
  cin>>n;
  d=n-1;
   while(d>=0)
  {
    if((n-d)%2!=0)
    {
      c=k;
      for(i=0;i<n-d-1;i++)
      {
        c++;
        cout<<c<<"*";
      }
      c++;
      cout<<c;
      cout<<"\n";
    }
    else
    {
      c=c+n-d+1;
      for(i=0;i<n-d-1;i++)
      {
        c--;
        if(i==0)
          k=c;
        cout<<c<<"*";
      }
      c--;
      cout<<c;
      cout<<"\n";
    }
    d--;
  }
}