#!/usr/bin/env python3

# filter()函数 用于过滤 序列
# filter() 参数：一个函数 和 一个序列，根据函数的返回值True还是False决定保留还是丢弃元素

def is_odd(n):
	return n%2 == 1

L = list(filter(is_odd, [1, 2, 3, 4, 5, 6, 7, 8, 9]))

print("list(filter(is_odd), [1, 2, 3, 4, 5, 6, 7, 8, 9]) = ", L)

# 删除序列中的空字符串

# s.strip(rm) 删除字符串中的rm 字符串，s.strip() 删除空白符 ('','\n', '\t', ' ')
def not_empty(s):
	return s and s.strip()
# filter() 返回的是一个Iterator, 也就是一个惰性序列, 所以用list()获得返回结果返回list
L = list(filter(not_empty, ['A', '', 'B', None, 'C', ' ']))
print("list(filter(not_empty, ['A', '', 'B', None, 'C', ' '])) = ", L)


# 用filter求素数

# 埃氏筛选 :2 是素数筛选掉 2的倍数，3 是素数筛选掉，3的倍数，5， 7, ... 
# Python 实现

# 构造一个从3开始的奇数序列
def _odd_iter():
	n = 1
	while True:
		n = n + 2
		yield n       # 这个函数是一个生成器

# 定义一个筛选函数
def _not_divisible(n):
	return lambda x: x % n > 0

# 定义一个生成器，不断返回下一个素数
def primes():
	yield 2
	it = _odd_iter() # 初始序列
	while True:
		n = next(it)
		yield n
		it = filter(_not_divisible(n), it) # 构造新的序列，接着筛选

# 运行说明，假设 n = 3, it = filter(_not_divisible(n), it) ;
# _not_divisible(3),   filter(x % 3 > 0, it)  it中的元素 6 % 3 = 0 < 0 :False被筛选掉

# 打印 1000 以内的素数, 迭代器迭代出
for n in primes():
	if n < 1000:
		print(n)
	else:
		break
