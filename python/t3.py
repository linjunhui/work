#!/usr/bin/env python3

L = list(range(1, 21))
print(L)

L1 = [(x, y) for x in L for y in L if(x == 2*y+2 or y == 2*x +2)]
print(L1)
print("个数：", len(L1))