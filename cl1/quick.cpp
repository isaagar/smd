	//parallel	

	#include<iostream>
	#include<omp.h>
	using namespace std;

	int k=0,n;

	class array
	{
	public:

	int partition(int arr[], int low_index, int high_index)
	{
		int i, j, temp, key;
		key = arr[low_index];
		i= low_index + 1;
		j= high_index;
		while(1)
		{
		while(i < high_index && key >= arr[i])
		    i++;
		while(key < arr[j])
		    j--;
		if(i < j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		else
		{
			temp= arr[low_index];
			arr[low_index] = arr[j];
			arr[j]= temp;
			cout<<"low= "<<low_index<<" high= "<<high_index<<" pivot= "<<key<<"\n";
				for(int x=0; x<n; x++)
				{
					cout<<arr[x]<<"\t";
				}
			cout<<"\n";
			return(j);
		}
		}
		}

		void quicksort(int arr[], int low_index, int high_index)
		{
		int j;

		if(low_index < high_index)
		{
			j = partition(arr, low_index, high_index);
			cout<<"Pivot element with index "<<j<<" has been found out by thread "<<k<<"\n";

			#pragma omp parallel sections
			{
			    #pragma omp section
			    {
				k=k+1;
				quicksort(arr, low_index, j - 1);
			    }

			    #pragma omp section
			    {
				k=k+1;
				quicksort(arr, j + 1, high_index);
			    }
	
			}
		}
		}

	};

	int main()
	{
	array a;

	int arr[100];
	int i;

	cout<<"Enter the value of n\n";
	cin>>n;
	cout<<"Enter the "<<n<<" number of elements \n";

	for(i=0;i<n;i++)
	{
		cin>>arr[i];
	}

	a.quicksort(arr, 0, n - 1);

	cout<<"Elements of array after sorting \n";
	for(i=0;i<n;i++)
	{
		cout<<arr[i]<<"\t";
	}

	cout<<"\n";
	} 

	/*
					OUTPUT
	[ccoew@localhost ]$ g++ quick.cpp
	[ccoew@localhost ]$ ./a.out
	Enter the value of n
	10
	Enter the 10 number of elements 
	66
	99
	11
	77
	33
	55
	22
	88
	44
	10
	low= 0 high= 9 pivot= 66
	22	10	11	44	33	55	66	88	77	99	
	Pivot element with index 6 has been found out by thread 0
	low= 0 high= 5 pivot= 22
	11	10	22	44	33	55	66	88	77	99	
	Pivot element with index 2 has been found out by thread 1
	low= 0 high= 1 pivot= 11
	10	11	22	44	33	55	66	88	77	99	
	Pivot element with index 1 has been found out by thread 2
	low= 3 high= 5 pivot= 44
	10	11	22	33	44	55	66	88	77	99	
	Pivot element with index 4 has been found out by thread 5
	low= 7 high= 9 pivot= 88
	10	11	22	33	44	55	66	77	88	99	
	Pivot element with index 8 has been found out by thread 8
	Elements of array after sorting 
	10	11	22	33	44	55	66	77	88	99	
	[ccoew@localhost ]$ 

	*/

