#include<iostream>
using namespace std;
int main()
{
  int n,i,v,l,u; 
cout<<"Enter the number of elements in the array"<<"\n"; 
cin>>n; 
u=n+1; 
int a[n],b[u]; 
cout<<"Enter the elements in the array"<<"\n"; 
for(i=0;i<n;i++) 
cin>>a[i]; 
cout<<"Enter the location where you wish to insert an element"<<"\n"; 
cin>>v; 
if(v>n) 
cout<<"Invalid Input"; 
else{ 
cout<<"Enter the value to insert"<<"\n"; 
cin>>l; 
b[v-1]=l; 
for(i=0;i<n;i++) 
{ 
if(i>=v-1) 
b[i+1]=a[i]; 
else 
b[i]=a[i]; 
} 
cout<<"Array after insertion is"; 
for(i=0;i<u;i++) 
cout<<"\n"<<b[i]; 
  return 0;
}
  //Type your code here.
}