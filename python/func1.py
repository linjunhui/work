#!/usr/bin/env python3
i = mabs(-10)

print(i)

def mabs(x):
	if not isinstance(x, (int, float)):
		raise TypeError('bad operate type')
	if x >= 0:
		return x
	else:
		return -x


a = mabs(-9)
print(a)