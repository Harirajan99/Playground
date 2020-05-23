#include<iostream>
using namespace std;
int main()
{
  int n,fact=1,i;
  cin>>n;
  for(i=1;i<=n;i++)
    fact=fact*i;
  cout<<"The factorial of "<<n<<" is "<<fact;
  //Type your code here.
}