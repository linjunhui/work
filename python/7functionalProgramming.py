#!/usr/bin/env python3

from functools import reduce

print("调用abs()函数，abs(-10) = ", abs(-10))

# 将函数本身赋值给变量
f = abs
print("将函数本身赋值给变量，f = abs, f(-11) = ", f(-11))

# 函数名也是变量 abs = 10, 那么abs不再指向原来求绝对值函数, abs(-10)出错
# 如果写了abs = 10 ,重启python交互环境 

# 一个函数可以接收另一个函数作为参数 称为高阶函数

def add(x, y, f):
	return f(x) + f(y)

print("高阶函数 add(5, -6, abs) = ", add(5, -6, f))


# map() 两个参数 一个是函数， 一个是Iterable，将传入的函数依次作用到序列的每个元素
# 并把结果作为新的Iterator返回

# 定义函数f
def f(x):
	return x * x
# 传入函数f, 列表[1, 2, ..., 9]
r = map(f, list(range(1, 10)))
# 返回的结果是 Iterator，使用list()计算出整个序列的值并返回一个list
print("list(map(f, list(range(1, 10))) = ", list(r))

# reduce 的用法 把一个函数作用在一个序列上， 函数必须接收两个参数
# reduce(f,[x1, x2, x3, x4]) = f((f(x1, x2), x3), x4)
# 使用reduce : from functools import reduce

def add(x, y):
	return x + y

print("sum = reduce(add, [1, 3, 5, 7]):", reduce(add, [1, 3, 5, 7]))
# 其实python有内建sum() 函数

# 将序列[1, 3, 5, 7] 转化为整数1357

def list2int(x, y):
	return x * 10 + y


print("reduce(list2int, [1, 3, 5, 7]) = ", reduce(list2int, [1, 3, 5, 7]))

# str转int

def char2num(s):
	return {'0': 0, '1':1, '2': 2, '3': 3, '4': 4, '5': 5, '6':6, '7':7, '8':8, '9':9}[s]

print("char2num('8') = ", char2num('8'))