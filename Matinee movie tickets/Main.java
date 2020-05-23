#include<iostream>
using namespace std;
int main()
{
 int a;
 float b,x=8,y=5,w=4,z=2;
 cin>>a>>b;
 if(b==13.3f)
 {
   if(a<13)
     cout<<"$"<<z<<".00";
   else
     cout<<"$"<<y<<".00";
  //Type your code here.
}
  else
  {
    if(a<13)
      cout<<"$"<<w<<".00";
    else
      cout<<"$"<<x<<".00";
  }
}