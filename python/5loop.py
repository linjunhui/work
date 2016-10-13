#!/usr/bin/env python3

# for..in循环, 依次把list或tuple中的每个元素迭代出来
names = ['Michael', 'Bob', 'Tracy']
for name in names:
	print(name)

# 计算1-10的整数和
sum = 0
for x in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:
	sum = sum + x
print("sum = ", sum)

# range()函数 生成 整数序列，再使用list() 函数转为list
s = list(range(5))
print("s = ", s)

sum = 0
for x in range(101):
	sum = sum + x	
print("sum = ", sum)


# while 循环，只要满足条件就不断循环
sum = 0
n = 99
while n > 0:
	sum = sum + n
	n = n - 2
print("sum = ", sum)
