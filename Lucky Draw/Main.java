#include<iostream>
using namespace std;
int main()
{
  int a,i,c=0;
  cin>>a;
 for(int i=1;i<a;i++)
 {
   if(a%i==0)
     c=c+1;
 }
  if(c==1)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}