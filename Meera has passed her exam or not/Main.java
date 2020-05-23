#include<iostream>
using namespace std;
int main()
{
  int n,c=0,f,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>f;
  for(i=1;i<n;i++)
  {
    if(f==a[i])
      c=1;
  }
  if(c==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  // Type your code here
}