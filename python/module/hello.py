#!/usr/bin/env python3

# 模块的文档注释
'a test modue'
# 变量写入作者名
__author__ = 'Jonson'

# 导入sys模块，sys模块有一个argv变量，用list存储了命令行的所有参数
import sys

def test():
	args = sys.argv
	if len(args)==1:
		print("Hello ,Jonson")
	elif len(args)==2:
		print("Hello, %s!" % args[1])
	else:
		print("Too many arguments!")
# 运行hello.py 的时候，解释器会把特殊__name__置为__main
# 在其它地方导入该模块是 if判断失效
if __name__=='__main__': 
	test()

