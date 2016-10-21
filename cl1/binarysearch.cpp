//============================================================================
// Name        : bs1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;


class binary{
	public:
	int n;
	int key;
	int arr[100];
	int copy1[100];
	void accept();
	void display();
	void sort();
	void realindex(int m);
void search(int key);

};
void binary::accept()
	{
		cout<<"enter number of elements ";
		cin>>n;
		if(n>100)
			cout<<"error";
		cout<<"enter digits";
		for (int i =0;i<n;i++)
		{
			cin>>arr[i];
			copy1[i]=arr[i];

		}
		sort();
	}

void binary::display()
	{
	cout<<"unsorted array\t";
	for (int i =0;i<n;i++)
		cout<<copy1[i]<<"\t";
	cout<<"\nsorted array\t";
	for (int i =0;i<n;i++)
		cout<<arr[i]<<"\t";
	}
void binary::sort()
{int i,j;
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
	if (arr[j+1]<arr[j])
	{
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
	}
}
}

}

void binary::realindex(int m)
{

for(int i=0;i<5;i++)
{
	if(copy1[i]==arr[m])
		cout<<"\n real index"<< i;


}

}
void binary::search(int key)
{
	int high=n-1, low=0 ,mid=(high+low)/2 ;
//if(key<arr[low]|| key>arr[high])
//cout<<"out of bound";

	while(low<=high)
	{
		if (arr[mid]==key)
		{
			cout<<"found at : "<<mid<<" in sorted list";
			realindex(mid);

			break;
		}
		if(key>arr[mid])
		{
			low=mid+1;
			mid=((high-low)/2)+low;


		}
		else if(key<arr[mid])
		{
			high=mid-1;
			mid=((high-low)/2);
		}

	}
	if(low>high)
	{
		cout<<"not found";
	}


}
int main() {
//cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!

binary b;
b.accept();
b.display();
int key;
cout<<"\nEnter value to be searched";
cin>>key;
b.search(key);
return 0;
}

/*OUTPUT
enter number of elements 5
enter digits4
8
7
1
2
unsorted array	4	8	7	1	2
sorted array	1	2	4	7	8
Enter value to be searched7
found at : 3 in sorted list
 real index2
 */
