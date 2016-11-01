# octothorpe is life
#
# python is not a compiled language, it is interpereted at run time
#

'''
I am a multiline comment

'''

def times(x,y):
	return x*y

o_file = open("oufile.txt","w")
o_file.write("test")
o_file.close()

print "hello world"

num = 7

if (num > 3):
	print "greater than"
elif (num == 3):
	print "equal"
else:
	print "less than"

for i in range(5):
	print "I'm the greatest " + str(i)
	print times(i,2)

