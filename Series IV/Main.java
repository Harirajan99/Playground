#include<iostream>
using namespace std;
int main()
{
  int a,c=0,d=2,i,j,e=0,y=1;
  cin>>a;
  if(a==1)
    cout<<"0";
  if(a>1){
    for(i=0;i<2;i++)
      cout<<(0+(i*2))<<" ";
  }
  if(a>2)
  {
    for(j=0;j<(a-2);j++)
        {
          d=d+(6+e);
          cout<<d<<" ";
          c=c+1;
          if(c==2)
          {
            e=(4*y);
            c=0;
            y=y+1;
          }
        }}
}
        
  