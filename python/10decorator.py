#!/usr/bin/env python3

import functools

# 函数也是对象，而且函数对象可以被赋值给变量，所以变量也能调用函数
def now():
	print('2015-3-25')
f = now
f()

# 函数对象有一个__name__ 属性，可以拿到函数对象的名字
print("now.__name__ = %s, f.__name__ = %s" % (now.__name__, f.__name__))

# 增加函数的功能，又不改变原函数的定义,这种在代码运行期间动态增加代码的方式，称之为"装饰器"(Decorator)

# 将原函数包进去，返回一个包裹后的函数
def log(func):
	def wrapper(*args, **kw):
		print('call %s():' % func.__name__)
		return func(*args, **kw)
	return wrapper
# 相当于now = log(now)
@log
def now():
	print('2015-5-25')

now()

print("我是分割线------------")
# now = log(now) 原函数仍然存在，只是now指向了新的函数log(now)

# 三层嵌套， 如果decorator本身需要传入参数，那就需要编写一个返回Decorator的高阶函数，如：自定义log的文本
def log(text):
	def decorator(func):
		def wrapper(*args, **kw):
			print('%s %s():' % (text, func.__name__))
			return func(*args, **kw)
		return wrapper
	return decorator

# 上面的话只是定义一个装饰器，现在来使用

@log('excute')
def now():
	print('ri~~~~~~')

now()

# 三层嵌套，now = log('excute')(now), 先执行log('excute'), 返回decorator 函数，在调用返回的函数参数是now

# 经过Decorator装饰后，它们的__name__ 从原来的now变成了wrapper，要把原来的名字复制到wrapper()函数中，否则有些
# 依赖函数签名的代码执行就会出错

# 不需要编写wrapper.__name__ = func.__name__ 这样的代码, Python有内置的functools.wraps
# import functools

def log(func):
	@functools.wraps(func)
	def wrapper(*args, **kw):
		print('call %s():' % func.__name__)
		return func(*args, **kw)
	return wrapper

# 针对带参数的decorator
def log(text):
	def decorator():
		@functools.wraps(func)
		def wrapper(*args, **kw):
			print('%s %s()' % (text, func.__name__))
			return func(*args, **kw)
		return wrapper
	return decorator