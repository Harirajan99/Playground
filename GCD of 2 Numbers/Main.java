#include<iostream>
using namespace std;
int gcd(int a,int b)
{
 if(a==0)
 return b;
 if(b==0)
 return a;
 if(a>b)
 return gcd(a-b,b);
 else
 return gcd(a,b-a);
}

int main()
{
 //Type your code here.
 int a,b;
 cin>>a>>b;
 cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);

  //Type your code here.
}