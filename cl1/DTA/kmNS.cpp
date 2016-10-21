	#include <iostream>
	#include <stdlib.h>
	using namespace std;

	class kmeans{
		public:
		int numbers, k,  count, min, groupnum, value, sum, ok,steps;
		int centroids[25], prevCen[25], distance[25][100], clusters[25][100], data[100];
		kmeans();
		void input();
		void kmean();

	};

	kmeans::kmeans()
	{
		numbers=k=count=min=groupnum=value=sum=0;
		ok=steps=1;
		for(int i=0;i<100;i++)
		{
			data[i]=0;
		}
	
		for(int i=0;i<25;i++)
		{
			for(int j=0;j<100;j++)
			{
				distance[i][j]=clusters[i][j]=0;
		
			}
	
			centroids[i]=prevCen[i]=0;

		}
	}

	void kmeans::input()
	{
		 cout << "Enter the number of data elements: ";
		 cin >> numbers;

		//get numbers
		 for(int i = 0; i < numbers; i++)
		 {
			  cout << "Enter Number " << i+1 << ": ";
			  cin >> data[i];
		 }

		 cout << "Enter the number of clusters: ";
		 cin >> k;

	 
	
	}



	void kmeans::kmean()
	{
		//show values entered by user
		cout << "Data Elements are: ";
		for(int i = 0; i < numbers; i++)
		{
		  cout << data[i]<<"\t";
		}
		// set values of centroids as initial 3 data elements
		for(int i = 0; i < k; i++)
		{
			centroids[i] = data[i];
		}

		cout<<endl;
		cout<<"Initial centroids chosen are"<<endl;
		for(int i=0;i<k;i++)
		{
			cout<<centroids[i]<<"\t";
		}
		cout<<endl;
		 

	
		while(ok == 1)
		{
			cout << endl << "Iteration Number: " << steps;
			//find distance of the centroids from data elements
			for(int i = 0; i < k; i++)
			{
				for(int j = 0; j < numbers; j++)
				{
					distance[i][j] = abs(centroids[i] - data[j]);
				}
			}

			//make clusters of elements with minimum distances
			for(int i = 0; i < numbers; i++)
			{
			min = 100000;
			    for(int j = 0; j < k; j++)
			    {
				if(distance[j][i] < min)
				{
					min = distance[j][i];
					value = data[i];
					groupnum = j;
				}
			    }
			clusters[groupnum][i] = value;
			}


			// display clusters and calculate new centroids
			cout << endl << "Clusters"<<"\t\t\t\t\t"<<"|Centroids" << endl;
			for(int i = 0; i < k; i++)
			{
				sum = 0;
				count = 0;
				cout << "Cluster " << i+1 << ": ";
				    for(int j = 0; j < numbers; j++)
				    {
					if(clusters[i][j] != 0)
					{
						cout << clusters[i][j] << "\t";
						sum += clusters[i][j];
						count++;
					}
				     }
				prevCen[i] = centroids[i];
				centroids[i] = sum/count;
				cout << "\t\t\t|" << centroids[i] << endl;
			}

			//reinitialise the clusters so that they can hold new values
			for(int i = 0; i < 25; i++)
			{
				for(int j = 0; j < 100; j++)
				{
					clusters[i][j] = 0;
				}
			}

			//check condition of termination(if means are same then clusters are same)
			ok = 0;
			for(int i = 0; i < k; i++)
			{
				if(prevCen[i] != centroids[i])
				{
					ok = 1;
				}
			}


		steps++;
		} // end while loop



	}


	int main()
	{
		kmeans k;
		k.input();
		k.kmean();
		return 0;
	}

	/*Output:1

	[ccoew@localhost ~]$ g++ kmNS.cpp
	[ccoew@localhost ~]$ ./a.out
	Enter the number of data elements: 12
	Enter Number 1: 16
	Enter Number 2: 18
	Enter Number 3: 87
	Enter Number 4: 42
	Enter Number 5: 24
	Enter Number 6: 51
	Enter Number 7: -10
	Enter Number 8: 19
	Enter Number 9: 9
	Enter Number 10: -68
	Enter Number 11: 44
	Enter Number 12: 33
	Enter the number of clusters: 3
	Data Elements are: 16	18	87	42	24	51	-10	19	9-68	44	33	
	Initial centroids chosen are
	16	18	87	

	Iteration Number: 1
	Clusters					|Centroids
	Cluster 1: 16	-10	9	-68				|-13
	Cluster 2: 18	42	24	51	19	44	33			|33
	Cluster 3: 87				|87

	Iteration Number: 2
	Clusters					|Centroids
	Cluster 1: -10	9	-68				|-23
	Cluster 2: 16	18	42	24	51	19	44	33		|30
	Cluster 3: 87				|87

	Iteration Number: 3
	Clusters					|Centroids
	Cluster 1: -10	-68				|-39
	Cluster 2: 16	18	42	24	51	19	9	44	33	|28
	Cluster 3: 87				|87

	Iteration Number: 4
	Clusters					|Centroids
	Cluster 1: -10	-68				|-39
	Cluster 2: 16	18	42	24	51	19	9	44	33	|28
	Cluster 3: 87	

	************************************************************************************************

	Output:2
	
	[ccoew@localhost ~]$ g++ kmNS.cpp
	[ccoew@localhost ~]$ ./a.out
	Enter the number of data elements: 8
	Enter Number 1: 5
	Enter Number 2: 3
	Enter Number 3: 4
	Enter Number 4: 2
	Enter Number 5: 6
	Enter Number 6: 7
	Enter Number 7: 8
	Enter Number 8: 5
	Enter the number of clusters: 2
	Data Elements are: 5	3	4	2	6	7	8	5	
	Initial centroids chosen are
	5	3	

	Iteration Number: 1
	Clusters					|Centroids
	Cluster 1: 5	4	6	7	8	5				|5
	Cluster 2: 3	2				|2

	Iteration Number: 2
	Clusters					|Centroids
	Cluster 1: 5	4	6	7	8	5				|5
	Cluster 2: 3	2				|2
	[ccoew@localhost ~]$ 

	*/
