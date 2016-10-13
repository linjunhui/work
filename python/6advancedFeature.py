#!/usr/bin/env python3
from collections import Iterable
from collections import Iterator

# Advanced Features

# 构造一个1, 3, 5, ..... , 99的列表
L = []
n = 1
while n <= 99:
	L.append(n)
	n = n + 2
print("L = ", L)


#  切片（Slice）
L = ['Michael', 'Sarah', 'Tracy', 'Bob', 'Jack']
# 取前3个元素
print("取前3个元素,蠢方法 L[0] = %s, L[1] = %s, L = %s" % (L[0], L[1], L[2]))

# 使用循环
r = []
n = 3
# range(n) 产生1, 2, 3, .. , n的序列
for i in range(n):
	r.append(L[i])
print("使用循环, 取前3个元素 r = ", r)

# 切片（Slice） 操作
# 返回一个新的list，并不改变原list
L[0: 3] #表示从 0 开始取到2 :0, 1, 2
print("L = %s\n L[0: 3] = %s" % (L, L[0: 3]))
# 第一个索引是0，可以省略，如：L[:3]
print("第一个索引是0，可以省略，如：L[: 3] = ", L[: 3])

# 从索引1开始取2个元素
L[1: 3]  # 包头不包尾，取得值包含开始的索引，不包含结尾的索引
print("L[1: 3] = ", L[1: 3])

# 可以使用L[-1]取list中倒数第一个元素，那么同样有倒数切片
print("从倒数第二个取到最后, L[-2: ] = ", L[-2: ])

# 创建一个0-99的数列
L = list(range(100))

print("取前10个数, L[: 10] = ", L[: 10])
print("取后10个数, L[-10: ] = ", L[-10: ])	
print("取前11-20的数, L[10: 20] = ", L[10: 20])
print("前10个数中, 隔两个取一个数, L[: 10: 2] = ", L[: 10: 2])
print("所有数, 隔5个取一个数, L[: : 5] = ", L[: : 5])
print("复制一个原list, L[: ] = ", L[: ])


t = tuple([1, 2, 3])
print(t)
# 前面是对list的切片操作，tuple也是一种列表区别是tuple不可变，对tuple切片操作返回也是切片
# list(range(50)) 先产生一个list，再用tuple() 将list转为tuple
# tuple不能修改，但是这里的t原来指向一个tuple，现在指向了另一个tuple，t是可变得
t = tuple(list(range(50)))
print("对tuple切片得到的是tuple = ", t[: 3])

# 字符串也可以看作一种list, 每个元素就是一个字符，因此字符串也有切片操作
print("字符串切片操作, 'papapa'[: 2] = ", 'papapa'[: 2])

# 迭代（Iteration）  for ... in
# 可作用于list、tuple 和 其他可迭代对象
# python 只要是可迭代对象，无论有无下标都可以迭代，比如字典(dict)
# dict不是按照顺序排列的，所以每次迭代出的顺序可能不同
d = {'a': 1, 'b': 3, 'c': 9}
for key in d:
	print(key)
# dict默认迭代出key, 如果要迭代value，使用for value in d.values()
for va in d.values():
	print(va)
# 同时迭代key 和 value
for k, v in d.items():
	print("%s--%s" % (k, v))

# 字符串也是可迭代对象
for ch in 'papapa':
	print(ch)

# 判断一个对象是否可以迭代 导入方法 from collections import Iterable
print("str 是否可迭代, isinstance('abc', Iterable):", isinstance('abc', Iterable))

# 对list实现带下标的迭代
for i, value in enumerate(['A', 'B', 'C']):
	print("list 带下标迭代 %d: %s" % (i, value))

# 同时引用两个变量 
# list中有 3个tuple，迭代出每个tuple，打印出tuple中的值
for x, y in [(1, 1), (2, 4), (3, 9)]:
	print(x, y)



# 列表生成式 （List Comprehensions）
# list(range(1, 11)) 生成list [1, 2, ..., 10] 包头不包尾
print("list(range(1, 11) = ", list(range(1, 11)))

# 生成[1x1, 2x2, ..., 10x10]
#循环
L = []
for x in range(1, 11):
	L.append(x*x)
print("L = ", L)

#列表生成式
L = [x * x for x in range(1, 11)]
print("列表生成式，[x * x for x in range(1, 11)] ：", L)

# 列表生成式，还可以加筛选条件
# 只要偶数的平方
L = [x * x for x in range(1, 11) if x % 2 == 0]
print("[x * x for x in range(1, 11) if x % 2 == 0]: ", L)

# 使用两层循环，生成全排列，三层以上很少用
L = [m+n for m in 'ABC' for n in 'XYZ']
print("两层循环，[m+n for m in 'ABC' for n in 'XYZ']：", L)

# 列表生成式使用两个变量生成list
d = {'x': 'A', 'y': 'B', 'z': 'C'}
L = [k + '=' + v for k, v in d.items()]
print("[k + '=' + v for k, v in d.items()]: ", L)

L = ['Hello', 'World', 'IBM']
print("[s.lower() for s in L]：", [s.lower() for s in L])

# 生成器 generator, 将列表生成式的最外层[] 改成（）就创建了一个generator
g = (x * x for x in range(10))
print("generator：", g)

# 使用next(g)获得 generator的下一个返回值
print("next(g) = %d, next(g) = %d, next(g) = %d" % (next(g), next(g), next(g)))
# generator是保存算法，每次调用next(g),就是计算出下一个元素的值，到最后没有元素是抛出
# StopIteration错误

# 对generator 一般使用迭代, 并且不必关心StopIteration错误
for n in g:
	print(n)


# 使用yield就可以吧 普通函数变成generator
# 计算斐波那契数列 的 函数
def fib(max):
	n, a, b = 0, 0, 1
	while n < max:
		# yield 返回一个值，再接着往下执行
		yield b  # 打印时使用print(b), 这里generator使用 yield b
		a, b = b, a + b
		n = n + 1
	return 'done'

f = fib(6)
# f 现在就是一个generator
for i in f:
	print(i)

# 要想拿到generator的return 返回值，必须捕获StopIteration错误
g = fib(10)
while True:
	try:
		x = next(g)
	except StopIteration as e:
		print("generator 返回值：", e.value)
		break

# for循环可用于的数据类型 1.集合类数据类型：list、tuple、dict、set、str等
#	2. generator 包括生成器 和 带yield 的generator function
# 可以直接用于for循环的对象统称为 可迭代对象:Iterable
# 可以使用isinstance() 判断一个对象是否是Iterable

# 可以被next()函数不断调用并不断返回下一个值得对象称为 迭代器：Iterator
# 也可以使用isinstance 判断一个对象是否是Iterator对象
# from collections import Iterator
print("判断一个对象是否是Iterator, isinstance((x for x in range(10)), Iterator)：", isinstance((x for x in range(10)), Iterator))


# 生成器都是Iterator， 但list、dict、str等数据类型都不是Iterator
# 可以使用iter() 将list、dict、str等Iterable变成Iterator
print("使用iter()将Iterable变成Iterator, isinstance(iter([]), Iterator):%s , isinstance(iter('ABC'), Iterator): %s " % (isinstance(iter([]), Iterator), isinstance(iter('ABC'), Iterator)))