	#include<iostream>
	#include<omp.h>

	using namespace std;
	int n;
	class sort
	{
		public:
			int quicksort(int a[],int low, int high)
			{
				if(low<high)
				{
					int p = partition(a, low, high);
					quicksort(a, low, p-1);
					quicksort(a, p+1, high);
				}
			}

			int partition(int a[], int low, int high)
			{
				int pivot,k,temp;
				pivot = a[high];
				k = low;
				for(int j=low; j<=high-1; j++)
				{
					if(a[j]<=pivot)
					{
						temp=a[k];
						a[k]=a[j];
						a[j]=temp;
						k=k+1;
					}
				}
		
				temp=a[k];
				a[k]=a[high];
				a[high]=temp;
				cout<<"low= "<<low<<" high= "<<high<<" pivot= "<<pivot<<"\n";
				for(int j=0; j<n; j++)
				{
					cout<<a[j]<<"\t";
				}
				cout<<"\n";

				return k;
			
		
			}
	};

	int main()
	{
		sort s;
	
		int a[100];
		cout<<"Enter the no. of elements in array\n";
		cin>>n;
		cout<<"Enter the elements\n";
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}	

		s.quicksort(a, 0, n-1);
	
		cout<<"Sorted array is \n";
		for(int j=0; j<n; j++)
		{
			cout<<a[j]<<"\t";
		}
	
		return 0;
	}

	/*
					OUTPUT:
	[ccoew@localhost ]$ g++ quickf.cpp
	[ccoew@localhost ]$ ./a.out
	Enter the no. of elements in array
	10
	Enter the elements
	78
	65
	91
	33
	48
	60
	43
	22
	99
	10
	low= 0 high= 9 pivot= 10
	10	65	91	33	48	60	43	22	99	78	
	low= 1 high= 9 pivot= 78
	10	65	33	48	60	43	22	78	99	91	
	low= 1 high= 6 pivot= 22
	10	22	33	48	60	43	65	78	99	91	
	low= 2 high= 6 pivot= 65
	10	22	33	48	60	43	65	78	99	91	
	low= 2 high= 5 pivot= 43
	10	22	33	43	60	48	65	78	99	91	
	low= 4 high= 5 pivot= 48
	10	22	33	43	48	60	65	78	99	91	
	low= 8 high= 9 pivot= 91
	10	22	33	43	48	60	65	78	91	99	
	Sorted array is 
	10	22	33	43	48	60	65	78	91	99	
	[ccoew@localhost ]$ 
	*/
