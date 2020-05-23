#include<iostream>
#include<math.h>
using namespace std;
int bac(int,int);
int main()
{
 int a,b,c,h;
 cin>>a>>b>>c;
 h=bac(a,b);
 if(h>=c)
 cout<<"Doctor, you can proceed with your experiment.";
 else
 cout<<"Sorry Doctor! You need more bacteria.";
}
int bac(int j,int i)
{
 return pow(j,i);
}
