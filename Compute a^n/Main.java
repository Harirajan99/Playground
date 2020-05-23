#include<iostream>
using namespace std;
int po(int x,int y)
{
 static int powe=0;
 if(y==1)
 return x;
 else
 {
 powe=x*(po(x,y-1));
 }
 return powe;
}

int main()
{
 //Type your code here.
 int a,b,d;
 cout<<"Enter the value of a";
 cin>>a;
 cout<<"\n"<<"Enter the value of n"<<"\n";
 cin>>b;
 d=po(a,b);
 cout<<"The value of "<<a<<" power "<<b<<" is "<<d;
  //Type your code here.
}