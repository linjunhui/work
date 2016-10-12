#!/usr/bin/env python3
'mabs module'
def m_abs(x):
	if not isinstance(x, (int, float)):
		raise TypeError('bad operate type')
	if x >= 0:
		return x
	else:
		return -x		