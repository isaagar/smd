
//Apriori
#include<iostream>
using namespace std;

int main()
{
	int tr,items;
	cout<<"\nEnter number of transactions:";
	cin>>tr;
	cout<<"\nEnter number of items:";
	cin>>items;
	int mat[tr][items];
	int min_supp;
	cout<<"\nEnter minimum support:";
	cin>>min_supp;
	cout<<"\nEnter items for transactions:";
	for(int i=0;i<tr;i++)
	{
		for(int j=0;j<items;j++)
		{
			cin>>mat[i][j];
		}
	}
	int count[items][2];
	for(int i=0;i<items;i++)
	{
	    count[i][0]=i;
		count[i][1]=0;
	}
	for(int i=0;i<tr;i++)
	{
		for(int j=0;j<items;j++)
		{
			if(mat[i][j]==1)
			{
				count[j][1]++;
			}
		}
	}
	cout<<"\nCounts for items:";
	for(int i=0;i<items;i++)
	{
		cout<<"\nItem"<<count[i][0]<<":"<<count[i][1];
	}
	cout<<"\n";
	cout<<"Items satisfying minimum support:";
	int prun1[items][2],prun_count1=0;
	for(int i=0;i<items;i++)
	{
		if(count[i][1]>=min_supp)
		{
		    prun1[prun_count1][0]=i;
			prun1[prun_count1][1]=count[i][1];
			
			cout<<"\nItem"<<prun1[prun_count1][0]<<":"<<prun1[prun_count1][1];
			prun_count1++;
		}
	}
	cout<<"\n";
	int count2_items=0;
	int j1[prun_count1*2][3];
	for(int i=0;i<items;i++)
	{
		for(int j=i+1;j<items;j++)  //replaced working value: prun_count1
		{
			j1[count2_items][0]=i;
			j1[count2_items][1]=j;
			j1[count2_items][2]=0;
			count2_items++;
		}
	}
	for(int i=0;i<tr;i++)
	{
		for(int j=0;j<count2_items;j++)
		{
			int item1=j1[j][0];
			int item2=j1[j][1];
			if(mat[i][item1]==1 && mat[i][item2]==1)
			{
				j1[j][2]++;
			}
		}
	}
	int prun2[count2_items][3];
	cout<<"\nOutput of joining step:";
	for(int i=0;i<count2_items;i++)
	{
		cout<<"\n"<<j1[i][0];
		cout<<"\t"<<j1[i][1];
		cout<<"\t"<<j1[i][2];
			
	}
	int count3_items=0;
	cout<<"\nOutput of pruning 2(2-frequent itemsets):";
	for(int i=0;i<count2_items;i++)
	{
		if(j1[i][2]>=min_supp)
		{
			prun2[count3_items][0]=j1[i][0];
			prun2[count3_items][1]=j1[i][1];
			prun2[count3_items][2]=j1[i][2];
			count3_items++;
		}
	}
	cout<<"\ncount3_items:"<<count3_items;
	cout<<"\nFrequent itemsets after 2 iterations:";
	for(int i=0;i<count3_items;i++)
	{
		cout<<"\n"<<prun2[i][0]<<"\t"<<prun2[i][1]<<"\tcount:"<<prun2[i][2];
	}
	cout<<"\n";

int count4_items=0;
int j2[count3_items*2][4];
for(int i=0;i<items;i++)
	{
		for(int j=i+1;j<items;j++)
		{
			for(int k=j+1;k<items;k++)
			{
				j2[count4_items][0]=i;
				j2[count4_items][1]=j;
				j2[count4_items][2]=k;
				j2[count4_items][3]=0;
				count4_items++;
			}
		}
	}

	for(int i=0;i<tr;i++)
	{
	    for(int j=0;j<count4_items;j++)
	    {
	        int item1=j2[j][0];
	        int item2=j2[j][1];
	        int item3=j2[j][2];
	        if(mat[i][item1]==1 && mat[i][item2]==1 && mat[i][item3]==1)
	        {
	            j2[j][3]++;
	            
	        }
	    }
	}
cout<<"\nOutput of join step:";
for(int i=0;i<count4_items;i++)
	{
		cout<<"\n"<<j2[i][0];
		cout<<"\t"<<j2[i][1];
		cout<<"\t"<<j2[i][2];
		cout<<"\t"<<j2[i][3];
	}
		int count5_items=0;
	    int prun3[count4_items][4];

for(int i=0;i<count4_items;i++)
	{
	    if(j2[i][3]>=min_supp)
	    {
	        prun3[count5_items][0]=j2[i][0];
	        prun3[count5_items][1]=j2[i][1];
	        prun3[count5_items][2]=j2[i][2];
	        prun3[count5_items][3]=j2[i][3];
	        count5_items++;
	    }
		
	}
	cout<<"\nOutput of prune step(frequent 3-itemsets):";
	for(int i=0;i<count5_items;i++)
	{
	    cout<<"\n"<<prun3[i][0];
		cout<<"\t"<<prun3[i][1];
		cout<<"\t"<<prun3[i][2];
		cout<<"\t"<<prun3[i][3];
	}
	return 0;
}

/*
OUTPUT:
[ccoew@localhost 4363]$ ./a.out

Enter number of transactions:4

Enter number of items:6

Enter minimum support:1

Enter items for transactions:1
1
1
0 
0
0
1
0
1
0
0
1
0
1
0
0
0
1
0
0
0
1
1
1

Counts for items:
Item0:2
Item1:2
Item2:2
Item3:1
Item4:1
Item5:3
Items satisfying minimum support:
Item0:2
Item1:2
Item2:2
Item3:1
Item4:1
Item5:3

Output of joining step:
0	1	1
0	2	2
0	3	0
0	4	0
0	5	1
1	2	1
1	3	0
1	4	0
1	5	1
2	3	0
2	4	0
2	5	1
3	4	1
3	5	1
4	5	1
Output of pruning 2(2-frequent itemsets):
count3_items:9
Frequent itemsets after 2 iterations:
0	1	count:1
0	2	count:2
0	5	count:1
1	2	count:1
1	5	count:1
2	5	count:1
3	4	count:1
3	5	count:1
4	5	count:1

Output of join step:
0	1	2	1
0	1	3	0
0	1	4	0
0	1	5	0
0	2	3	0
0	2	4	0
0	2	5	1
0	3	4	0
0	3	5	0
0	4	5	0
1	2	3	0
1	2	4	0
1	2	5	0
1	3	4	0
1	3	5	0
1	4	5	0
2	3	4	0
2	3	5	0
2	4	5	0
3	4	5	1
Output of prune step(frequent 3-itemsets):
0	1	2	1
0	2	5	1
3	4	5	1*/
