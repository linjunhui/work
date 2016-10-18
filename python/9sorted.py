#!/usr/bin/env python3

print("sorted([44, 22, 88, -13, 9 , 1]) = ", sorted([44, 22, 88, -13, 9 , 1]))

# sorted() 是一个高阶函数，可以接收一个key函数实现自定义的排序

# key指定的函数作用在list的每一个元素上，根据key返回的结果对原list进行排序
print("sorted([-1, 34, -5, 7, -8, 9], key=abs) = ", sorted([-1, 34, -5, 7, -8, 9], key=abs))

# 字符串排序, 按首字母的ascii码排序

print("sorted(['b', 'aa', 'cc', 'd', 'e', 'f']", sorted(['aa', 'b', 'cc', 'd', 'e', 'f']))

# 反向排序，传入reverse=True
print("sorted(['bob', 'Zoo', 'Credit'], key=str.lower, reverse=True) = ", sorted(['bob', 'Zoo', 'Credit'], key=str.lower, reverse=True))
