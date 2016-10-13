#!/usr/bin/env python3

# 列表:list 有序的集合，可以随时添加和删除其中的元素
classmates = ['Michael', 'Bob', 'Tracy']
print("classmates = %s ,len(classmates) = %d" % (classmates, len(classmates)))

# 用索引来访问list中每一个位置的元素, 超出索引范围报错IndexError
print("classmates[0] = ", classmates[0])	
# -1 做索引直接获取最后一个元素 依次递推 -2倒数第二个
print("classmates[-1] = ", classmates[-1])

# list是 可变 有序表，所以可以往list末尾追加元素
classmates.append('Adam')
print("classmates = %s ", classmates)

# 插入元素到指定位置
classmates.insert(1, "Jack")
print("classmates = %s ", classmates)

#删除list末尾的元素
classmates.pop()
print("classmates = %s ", classmates)

#修改
classmates[1] = 'Sarah'
print("classmates = %s ", classmates)

# list中可以存不同的数据类型
L = ['Apple', 123, True]
print('L = ', L)

# list中的元素也可以是list
s = ['python', 'java', ['asp', 'php'], 'scheme']
print('s = ', s)
print("len(4) = ", len(s))

M = []
print("M = %s, len(M) = %d" % (M, len(M)))

# 有序表tuple，与list非常类似，但tuple一旦初始化就不能修改,没有append()、insert()这样的方法，也不能赋值
roommates = ('Michael', 'Bob', 'Tracy')

# 仍可以使用 roommates[0]、roommates[-1] 来访问
print("roommates[1] = ", roommates[1])

# 定义一个tuple时，要在定义的时候就把元素确定下来
t = (1, 2)
print("t = ", t)

# 定义一个空的tuple
p = ()
print("p = ", p)
# 定义只有一个元素的tuple时, 加一个逗号，避免与算数意义上的括号冲突
q = (1,)
print("q = ", q)

# 一种 "可变的" tuple
w = ('a', 'b', ['A', 'B'])
print('w = ', w)

w[2][0] = 'X'
w[2][1] = 'Y'
print('w = ', w)
# tuple 中指向的list并没有变，变得是list的内容