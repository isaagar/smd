	digit     [0-9]
	letter    [A-Za-z]
	under     [_]
	%{ 
	    #include <stdio.h>
	    int cntkey=0,cntd=0,cntop=0,cntid=0,cntok=0,linecount=1,errline[20],err=0;
	    FILE *out;
	%}
	%%
	"\n" { ++linecount ; } 
	    
	{digit} {
		 fprintf(out,"%d\t%s\tdigit\n",linecount,yytext);
		 cntd++;
		}
		 
	if |
	else |
	main |
	int  |
	while |
	do |
	continue |
	break |
	case |
	void |
	return     {
	    fprintf(out,"%d\t%s\tkeyword \n",linecount,yytext);
	    cntkey++;
	    }
	"+" |
	"-" |
	"/" |
	"*" |
	":" |
	"=" {
	     fprintf(out,"%d\t%s\toperator \n",linecount,yytext);
	     cntop++;
	     }
	"(" |
	")" |
	"{" |
	"}" |
	";" |
	"," |
	"//" {
	       fprintf(out,"%d\t%s\tpunctuation \n",linecount,yytext);
	       cntok++;
	      }
	{letter}({letter}|{digit}|{under})* {
						fprintf(out,"%d\t%s\tidentifier\n",linecount,yytext);
						cntid++;
					    }
	({letter}|{digit}|{under})+if |
	({letter}|{digit}|{under})+else |
	({letter}|{digit}|{under})+main |
	({letter}|{digit}|{under})+int  |
	({letter}|{digit}|{under})+while |
	({letter}|{digit}|{under})+do |
	({letter}|{digit}|{under})+continue |
	({letter}|{digit}|{under})+break |
	({letter}|{digit}|{under})+case |
	({letter}|{digit}|{under})+void |
	({letter}|{digit}|{under})+return {
	    fprintf(out,"%d\t%s\terror : bad keyword \n",linecount,yytext);
	    errline[err]=linecount;
	    err++;
	    
	  }


	{digit}+({letter}|{under})+ |
	{under}+({letter}|{digit})+    {
						fprintf(out,"%d\t%s\terror : bad identifier\n",linecount,yytext);
						 errline[err]=linecount;
	    					err++;
					   }



	%%
	int main(int argc,char *argv[]) {
	    yyin=fopen(argv[1],"r");
	    out=fopen(argv[2],"w");
	    yylex();
	    int i;
	    
	
	for(i=0;i<err;i++)
	{fprintf(out,"error %d at line no. %d\n",i+1,errline[i]);}
	    return 0;
	}
	int yywrap()
	{ 
	}


	//input.c
	main()
	{
	int a,b;
	a=10;
	b=20;
	int 52eas;
	a=b+a*2;
	int _q2
	}
	//output:
	output.txt



	1	main	keyword 
	1	(	punctuation 
	1	)	punctuation 
	2	{	punctuation 
	3	int	keyword 
	3	a	identifier
	3	,	punctuation 
	3	b	identifier
	3	;	punctuation 
	4	a	identifier
	4	=	operator 
	4	1	digit
	4	0	digit
	4	;	punctuation 
	5	b	identifier
	5	=	operator 
	5	2	digit
	5	0	digit
	5	;	punctuation 
	6	int	keyword 
	6	52eas	error : bad identifier
	6	;	punctuation 
	7	a	identifier
	7	=	operator 
	7	b	identifier
	7	+	operator 
	7	a	identifier
	7	*	operator 
	7	2	digit
	7	;	punctuation 
	8	int	keyword 
	8	_q2	error : bad identifier
	9	}	punctuation 
	error 1 at line no. 6
	error 2 at line no. 8

