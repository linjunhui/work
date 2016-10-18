#!/usr/bin/env python3
L1 = [3, 4, 5, 6, 7, 8]
L = [q + w*10 + e*100 + r*1000 for q in L1 for w in L1 for e in L1 for r in L1 if (q!=w and q!=e and q!=r and w!=e and w!=r and e!=r) ]
#print(L)
L2 = [t for t in L if t%2==1]
L3 = sorted(L2)
print(L3)

print("L3[61] = ", L3[61])
