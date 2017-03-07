from sys import argv

script, use_name = argv
prompt = '> '

print "Hi %s, I'm the %s script." % (use_name, script)
print "I'd like to ask you a few questions."
print "Do you like me %s?" % use_name
likes = raw_input(prompt)

print "Where do you like %s?" % use_name
lives = raw_input(prompt)

print "What kind of computer do you have?"
computer = raw_input(prompt)

print """
Alright, so you said %r about liking me.
You live in %r, Not sure where that is.
And you have a %r computer. Nice.
""" % (likes, lives, computer)
