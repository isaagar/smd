#include <stdio.h>

char buffer[30];//For storing the input string
int i=0;//index into the array of input string
void S();
void B();
void B1();
void D();
void F();
void E();
void match(char c);
void match(char c)
{
	if(buffer[i]==c)
	{
		i++;
	}
	else
	{	
		printf("Error");
		exit(0);
	}
}
void S()
{
	printf("\nThe Production S => aBDh  is used");
	match('a');
	B();
	D();
	match('h');
	
}
void B()
{
	printf("\nThe Production B => cB1 is used");
	match('c');
	B1();
}
void B1()
{
	int j=i+1;
	if(buffer[i]=='b')
	{
		printf("\nThe Production B1=>bB1 is used");
		match('b');
		B1();
	}
	else
	{
		printf("\nThe Production B1=>null is used");
		return;		
	}
}
void D()
{	
	printf("\nThe production D=>EF is used");
	E();
	F();
}
void E()
{
	if(buffer[i]=='g')
	{
		printf("\nThe Production E=>g is used");
		match('g');
	}
	else
	{
		printf("\nThe Production E=>null is used");
		return;
	}
}
 
void F()
{
	if(buffer[i]=='f')
	{
		printf("\nThe Production F=>f is used");
		match('f');
	}
	else
	{
		printf("\nThe Production F=>null is used");
		return;
	}
}
void main()
 {
   printf("\nEnter input string:");
   gets(buffer);
   S();
   printf("\nIt is a valid string");
 }
