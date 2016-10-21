	//Recursive binary search

	#include<iostream>
	using namespace std;

	int AR[100];
	int bsearch(int VAL,int left, int right);
	void sort(int n);
	void accept(int n);
	int main()
	{
		int n,val;
		int found;
	
		cout<<"Enter number of elements you want to insert ";
		cin>>n;
		accept(n);

		sort(n);

		cout<<"\nEnter the number you want to search ";
		cin>>val;

		found=bsearch(val,0,n-1);

		if(found!=0)
			cout<<"\nItem found at: "<<found+1<<" position\n";
		else
			cout<<"\nItem not found";
	
		return 0;
	}

	void accept(int n)
	{

		cout<<"Enter elements\n";
		for(int i=0;i<n;i++)
		{
			cout<<"Enter element "<<i+1<<":";
			cin>>AR[i];
		}
	}

	int bsearch(int VAL,int left, int right)
	{
		int Mid;
		if(left<=right)
		{
			Mid=(left+right)/2;
			if(VAL>AR[Mid])
				return bsearch(VAL,Mid+1,right);
			else if(VAL<AR[Mid])
				return bsearch(VAL,left,Mid-1);
			else
				return Mid;
		}
		return 0;
	}


	void sort(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{		
				if(AR[j]>AR[j+1])
				{
					int temp=AR[j];
					AR[j]=AR[j+1];
					AR[j+1]=temp;
				}
			}
		}

		cout<<"Sorted array is:";
		for(int i=0;i<n;i++)
		{
			cout<<AR[i]<<"  ";
		}
	}

	/*
	[ccoew@localhost ~]$ g++ recursivesearch.cpp
	[ccoew@localhost ~]$ ./a.out
	Enter number of elements you want to insert 6
	Enter elements
	Enter element 1:2
	Enter element 2:6
	Enter element 3:8
	Enter element 4:14
	Enter element 5:18
	Enter element 6:20
	Sorted array is:2  6  8  14  18  20  
	Enter the number you want to search 6

	Item found at: 2 position
	[ccoew@localhost ~]$ 


	[ccoew@localhost ~]$ ./a.out
	Enter number of elements you want to insert 6
	Enter elements
	Enter element 1:8
	Enter element 2:4
	Enter element 3:21
	Enter element 4:12
	Enter element 5:36
	Enter element 6:5
	Sorted array is:4  5  8  12  21  36  
	Enter the number you want to search 21

	Item found at: 5 position

	*/
