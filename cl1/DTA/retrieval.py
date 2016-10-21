from __future__import division
import math
buff=[]
text_1=open("file1.txt","r")
for line in text_1:
	for word inline.split():
	buff.append(word)
	#print(word)
text_1.close()

buff1=[]
text_2=open("file2.txt","r")

for line in text_2:
	for word inline.split():
	buff1.append(word)
	#print(word)
text_2.close()

for i in range(0,len(buff)):
	w=buff[i]
	for j in range(0,len(buff1)):
		#print w +"----"+buff1[j]
		if(buff1[j]==w):
			buff[i]="
#for i in range(0,len(buff)):
#print buff[i]
buff3 =[x for x in buff if x!="]

print"Intermediate code : "
for i in range(0,len(buff3)):
	print buff3[i]
buff4=[]
str1='ing'
str2='re'
str3='ition'

for i in range(0,len(buff3)):
	w=buff3[i]
	if str1 in w:
		w1=w.replace('ing','e')
		buff4.append(w1)
	elif str2 in w:
		w1=w.replace('re',")
		buff4.append(w1)
	elif str3 in w:
		w1=w.replace('ition','e')
		buff4.append(w1)
print "\n\n"
print "final output"
print buff4

print "\n"
buff5=[]
text_3=open("d1.txt","r")
for line in text_3:	
	for word in line.split():
		buff5.append(word)
text_3.close()

print "document1:"
print buff5

buff6=[]
text_4=open("d2.txt","r")
for line in text_4:
	for word in line.split():
		buff6.append(word)

text_4.close()
print "document 2"
print  buff6




buff7=[]
text_5=open("d3.txt","r")
for line in text_5:
	for word in line.split():
		buff7.append(word)

text_5.close()
print "document 3"
print  buff7

buff8='dance'
print "query",buff8
print "\n\n"
d1=0
d7=0
d10=0
d9=0
for i in range(0,len(buff5));
w=buff5[i]
if(buff8==w):
d1=d1+1
if(d1>=1):
d7=1
print "total counr (tf) for d1:",d1
print "for document 1 df:",d7
print "\n\n"
d2=0
for i in range(0,len(buff6)):
w=buff6[i]
if(buff8==w):
d2=d2+1
if(d2>=1):
d10=1
print "total counr (tf) for d2:",d2
print "for document 2 df:",d10
print "\n\n"
d3=0


