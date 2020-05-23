#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b=11,i;
  cin>>a;
  for(i=0;i<a;i++){
    cout<<pow(b,2)<<" ";
    b=b+4;
}
}