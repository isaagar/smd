

	
import sys
import os

n=input("Enter the number of elements:")
arr=list()

for i in range(0,n):
	a=input("Enter number: ")
	arr.append(int(a))
arr.sort()	
print "Array: ",arr
left=0
right=n-1

key=input("Enter the number to be searched: ")
print "Key: ",key

def binary(left,right):
	if(left>right):
		print "Element not present in the list. "

	elif((key>=arr[left]) and (key<=arr[right])):
		sep=(left+right)/2
		print "Separator: ",sep

		if(key==arr[sep]):
			print "Element found at position ",sep
		elif(key<arr[sep]):
			binary(left,sep-1)
		elif(key>arr[sep]):
			binary(sep+1,right)

	elif((key<arr[left]) or (key>arr[right])):
		print "Element not present in the list. "

binary(left=0,right=n-1)
		    
'''
OUTPUT:

*) IF USER GIVES UNSORTED ARRAY:

[ccoew@localhost 4960]$ python bin_search.py
Enter the number of elements:10
Enter number: 2
Enter number: 3
Enter number: 1
Enter number: 5
Enter number: 4
Enter number: 6
Enter number: 8
Enter number: 7
Enter number: 9
Enter number: 10
Array:  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Enter the number to be searched: 4
Key:  4
Separator:  4
Separator:  1
Separator:  2
Separator:  3
Element found at position  3



2)[ccoew@localhost 4960]$ python bin_search.py
Enter the number of elements:10
Enter number: 2
Enter number: 4
Enter number: 5
Enter number: 6
Enter number: 7
Enter number: 8
Enter number: 9
Enter number: 12
Enter number: 14
Enter number: 16
Array:  [2, 4, 5, 6, 7, 8, 9, 12, 14, 16]
Enter the number to be searched: 1
Key:  1
Element not present in the list. 

3)[ccoew@localhost 4960]$ python bin_search.py
Enter the number of elements:10
Enter number: 1
Enter number: 2
Enter number: 3
Enter number: 4
Enter number: 5
Enter number: 7
Enter number: 8
Enter number: 9
Enter number: 10
Enter number: 12
Array:  [1, 2, 3, 4, 5, 7, 8, 9, 10, 12]
Enter the number to be searched: 6
Key:  6
Separator:  4
Element not present in the list. 

4)[ccoew@localhost 4960]$ python bin_search.py
Enter the number of elements:5
Enter number: 1
Enter number: 3
Enter number: 5
Enter number: 7
Enter number: 9
Array:  [1, 3, 5, 7, 9]
Enter the number to be searched: 10
Key:  10
Element not present in the list. 

5)[ccoew@localhost 4960]$ python bin_search.py
Enter the number of elements:10
Enter number: 1
Enter number: 2
Enter number: 3
Enter number: 5
Enter number: 6
Enter number: 7
Enter number: 8
Enter number: 9
Enter number: 10
Enter number: 11
Array:  [1, 2, 3, 5, 6, 7, 8, 9, 10, 11]
Enter the number to be searched: 4
Key:  4
Separator:  4
Separator:  1
Separator:  2
Element not present in the list. 

'''
