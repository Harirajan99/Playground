#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int b;
  char a[100];
  cin>>a>>b;
  if(strcmp(a,"front")==0)
     {
       if(b%2==0)
         cout<<"Right Handed";
       else
         cout<<"Left Handed";
     }
  else
  {
    if(b%2==0)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  //Type your code here.
}