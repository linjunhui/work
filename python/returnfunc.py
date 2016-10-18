#!/usr/bin/env python3

def calc_sum(*args):
	ax = 0;
	for n in args:
		ax = ax + n
	return ax

# 返回的是一个函数 和 传入的参数和相关变量都保存在函数中，闭包(Closure)
def lazy_sum(*args):
	def sum():
		ax = 0
		for n in args:
			ax = ax + n
		return ax
	return sum

# 返回的是一个函数
f = lazy_sum(1, 3, 5, 7)
# f() 执行函数
print("f() = ", f())

# 注意点： 每次调用lazy_sum(),都会返回一个新的函数，即使传入的参数相同
g = lazy_sum(1, 3, 5, 7)

print("f == g:", f == g)

h = f
print("h = f, h() = ", h())

# 闭包
def count():
	fs = []
	for i in range(1, 4):
		def f():
			return i*i
		fs.append(f)
	return fs
f1, f2, f3 = count()
# 函数引用了变量i, 但它并非立刻执行， 等到3个函数都返回时，它们所引用的变量 i 已经变成了3，所以最终结果为9
print("f1, f2, f3 = ", f1(), f2(), f3())


# 
def count2():
	def f(j):
		def g():
			return j*j
		return g
	fs = []
	for i in range(1, 4):
		fs.append(f(i))  # f(1) 立刻被执行，因此i的当前值被传入f()
	return fs

g1, g2, g3 = count2()

print("g1() = %d, g2() = %d, g3() = %d" % (g1(), g2(), g3()))


# 匿名函数 

L = list(map(lambda x: x*x, [1, 2, 3, 4, 5, 6, 7, 8, 9]))
print("list(map(lambda x: x*x, [1, 2, 3, 4, 5, 6, 7, 8, 9])) = ", L)

# 匿名函数lambda 冒号前面的是参数， 只能有一个表达式，所以不用写return
# 匿名函数也是一个函数对象，也可以把一个匿名函数赋值给一个变脸
f = lambda x: x*x

print("f = lambda x: x*x, f(5) = ", f(5))

# 也可以把匿名函数作为返回值返回
def build(x, y):
	return lambda: x*x + y*y

f = build(6, 8)
print(f())
