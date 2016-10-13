#!/usr/bin/env python3

# 条件后面有冒号，根据缩进规则执行语句
age = 20
if age >= 18:
	print("your age is ", age)
	print("adult")

age = 3
if age >= 18:
	print('your age is', age)
	print('adult')
else:
	print('your age is', age)
	print('teenager')

# elif 是else if的缩写
age = 7
if age >= 18:
	print('adult')
elif age >= 6:
	print('teenager')
else:
	print('kid')

# if条件的简写 只要 x 是非零的数值，非空的字符串，非空的list就判断为True,否则为False
x = 'papapa'
if x:
	print("x = ", x)

# input 引号中的作用只是在输入前打印的字符串，没影响
s = input('birth:')
# 输入的是字符串，使用int()将字符串转换为整型，字符串不是合法的数字时报错
birth = int(s)
if birth < 2000:
	print("00前")
else:
	print("00后")