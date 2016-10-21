	#lexical

	def linecount(s):
		lines=s.split("\n")
		return lines
	def wordcount(lines):
		wc=0
		for l in lines:
			words=l.split()
			wc=wc+len(words)
		return wc

	def charcount(lines):
		cc=0
		for l in lines:
			characs=[l[i] for i in range(len(l))]
			cc=cc+len(characs)
		return cc
	def specialchar(lines):
		sc=0
		for l in lines:
			characs=[l[i] for i in range(len(l))]
			for c in characs:
				t=(not(c.isalpha()) and c!=" " and c!="\n" and not(c.isdigit()))
				if t:
					sc=sc+1	
		return sc

	def alphacount(lines):
		ac=0
		for l in lines:
			characs=[l[i] for i in range(len(l))]
			for c in characs:
				if c.isalpha():
					ac=ac+1	
		return ac

	def digcount(lines):
		dc=0
		for l in lines:
			characs=[l[i] for i in range(len(l))]
			for c in characs:
				if c.isdigit():
					dc=dc+1	
		return dc

	fo = open("input.cpp", "r")
	s=fo.read()
	print "contents of the file are : "
	print s
	lines=linecount(s)
	lc=len(lines)-1
	print "no of lines :" 
	print lc	
	print "no of words :" 
	print wordcount(lines)
	print "no of characters"
	print charcount(lines)
	print "no of special symbols : "
	print specialchar(lines)
	print "no of alphabets : "
	print alphacount(lines)
	print "no of digits : "
	print digcount(lines)

	'''			output
	[ccoew@localhost ~]$ python lexical.py
	contents of the file are : 
	main()
	{
	int a,b;
	a = 10;
	b = 20;
	a = b+a*2;
	}

	no of lines :
	7
	no of words :
	14
	no of characters
	40
	no of special symbols : 
	14
	no of alphabets : 
	14
	no of digits : 
	5
	'''
