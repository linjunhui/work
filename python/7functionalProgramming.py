#!/usr/bin/env python3


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
