#!/usr/bin/env python3
import math

tem = '%d' %math.factorial(10000)
print(tem)
print(tem.index('79008'))
print(len(tem))
print("0的个数：", (len(tem) - tem.index('79008') - 5))