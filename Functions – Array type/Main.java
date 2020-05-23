#include<iostream>
using namespace std;
int main()
{
  int n,i,e=0,o=0; 
cout<<"Enter the number of elements in the array"<<"\n"; 
cin>>n; 
int a[n]; 
cout<<"Enter the elements in the array"<<"\n"; 
for(i=0;i<n;i++){ 
cin>>a[i]; 
if(a[i]%2==0) 
e=1; 
else 
o=1; 
} 
if(e==1 && o==1) 
cout<<"The array is Mixed"; 
else if(e==1) 
cout<<"The array is Even"; 
else 
cout<<"The array is Odd"; 
return 0;
  //Type your code here.
}