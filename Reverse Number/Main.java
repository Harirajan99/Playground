#include <iostream>
using namespace std;
int main() 
{
  int n,r,rv=0;
  cin>>n;
  while(n!=0)
  {
    r=n%10;
    rv=rv*10+r;
    n/=10;
  }
  cout<<rv;
	// Type your code here
	return 0;
}