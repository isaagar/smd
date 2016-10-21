	//KNN Assignment	
	
	#include <iostream>
	#include <math.h>

	using namespace std;

	int main()
	{
		int x1[10],x2[10], dist[10], test[10],rank[10];
		int ele,a,b, min=100,k,cnt,bad=0,g=0;
		char clas[10][10], class2[10][10];
		string str1[10], str2[10];

		cout<<"Enter total no. of records: "<<endl;
		cin>>ele;
	
		cout<<"\nEnter values for 1st parameter X1:"<<endl;
		for(int i=0;i<ele;i++)
		{
			cin>>x1[i];
		}

		cout<<"\nEnter values for 2nd parameter X2:"<<endl;
		for(int i=0;i<ele;i++)
		{
			cin>>x2[i];
		}

		cout<<"\nEnter class values of records: "<<endl;
		for(int i=0;i<ele;i++)
		{
			cin>>str1[i];
		}
	
		cout<<"\nValues of class to be guessed: "<<endl;
		cin>>a>>b;

		cout<<"Enter value of k: ";
		cin>>k;

		for(int i=0;i<ele;i++)
		{
			int n1=((x1[i]-a)*(x1[i]-a));
			int n2=((x2[i]-b)*(x2[i]-b));

			dist[i]=n1+n2;
			cout<<"\nDistance square of record "<<i+1<<": "<<dist[i]<<endl; 
		}
		for(int i=0; i<ele; i++)
		  test[i]=dist[i];
		  
		for(int i=0;i<ele;i++)
		{ 
		  int cnt=0;
		  min=100;
		   for(int j=0;j<ele;j++)
			{
			  if(test[j]<min)
			  { 
			    min=test[j];
			    rank[j]=i+1;
			    cnt=j;
			  } 
			}   
		  test[cnt]=100;  
		}

		cout<<"\nRecord\t \tDistanceSq \t Rank \t Class "<<endl;
		for(int j=0;j<ele;j++)
		  cout<<x1[j]<<"\t"<<x2[j]<<"\t  "<<dist[j]<<"\t\t "<<rank[j]<<"\t  "<<str1[j]<<endl;

		//class sorting
		for(int i=0; i<k; i++)
		  for(int j=0; j<ele; j++)
		    if(rank[j]==i+1)
		      str2[i]=str1[j];

		//comparing
		for(int i=0; i<k; i++)
		{
		  if(str2[i]=="bad")
		    bad++;

		  else if(str2[i]=="good")
		    g++;
		}

		if(g>bad)
		  cout<<"\nMajority is good, so co-ordinates belong to good class"<<endl;
		else
		  cout<<"\nMajority is bad, so co-ordinates belong to bad class"<<endl;

		return 0;
	}

	/*
	OUTPUT1:
	[ccoew@localhost ~]$ g++ knn.cpp
	[ccoew@localhost ~]$ ./a.out
	Enter total no. of records: 
	4

	Enter values for 1st parameter X1:
	7 7 3 1

	Enter values for 2nd parameter X2:
	7 4 4 4

	Enter class values of records: 
	bad good good good

	Values of class to be guessed: 
	3 7
	Enter value of k: 3

	Distance square of record 1: 16

	Distance square of record 2: 25

	Distance square of record 3: 9

	Distance square of record 4: 13

	Record	 	DistanceSq 	 Rank 	 Class 
	7	7	  16		 3	  bad
	7	4	  25		 4	  good
	3	4	  9		 1	  good
	1	4	  13		 2	  good

	Majority is good, so co-ordinates belong to good class

	***************************************************************************

	
