#!/usr/bin/env python3

#coding=utf-8
# 用来保存学生信息, 中括号 list
nameList = []

while True:
	print("-"*30)
	print("  python版学生管理系统 V8.8")
	print("1 添加学生信息")
	print("2 删除学生信息")
	print("3 修改学生信息")
	print("4 查询学生信息")
	print("5 退出系统")
	print("-"*30)

	# 2.等待用户进行选择
	# raw_input 将所有输入当做字符串看待
	#optionNum = raw_input
	# python3 后不再有raw_input ，input 和 raw_input等效
	optionNum = int(input("请进行选择（数字）："))

	# 3.根据用户的选择执行相应的操作
	if optionNum == 1:
		# 3.1 提示用户输入学生的名字并获取
		name = input("请输入姓名：")

		# 3.2 提示用户输入学生的籍贯并获取
		addr = input("请输入籍贯：")

		# 3.3.1 把姓名和籍贯进行组装
		# 大括号 dict
		tempInfo = {}
		tempInfo['name'] = name
		tempInfo['addr'] = addr

		# 3.3 添加到系统中
		nameList.append(tempInfo)

	elif optionNum == 2:
		if(len(nameList) == 0):
			print("*" * 20)
			print("当前系统中没有学生信息")
			print("*" * 20)
			continue

		i = 0
		# 先提示当前所有的信息
		for info in nameList:
			print("%d      %s       %s" % (i, info['name'], info['addr']))
			i+=1

		# 让用户选择要删除的信息
		delNum = int(input("请输入要删除学生的序号（数字）："))

		# 删除
		if delNum < len(nameList) and delNum>=0:
			#list 用pop()也是可以的 nameList.pop(delNum)
			del nameList[delNum]

	elif optionNum == 3:
		# 显示当前所有的学生信息
		i = 0
		for info in nameList:
			print("%d      %s       %s" % (i, info['name'], info['addr']))
			i+=1
		
		# 输入要修改的学生序号
		modifyNum = int(input("请输入要修改的学生序号(数字)："))

		# 输入新的姓名
		name = input("请输入新的姓名：")
		# 输入新籍贯
		addr = input("请输入新的籍贯：")

		#把姓名和籍贯进行组装
		tempInfo = {}
		tempInfo['name'] = name
		tempInfo['addr'] = addr

		#添加到系统中
		nameList[modifyNum] = tempInfo

	elif optionNum == 4:
		name = input("请输入要查询的姓名：")

		for info in nameList:
			if info['name'] == name:
				print("****找到了****")

	elif optionNum == 5:
		confirm = input("确实要退出????????")
		confirm = confirm.lower()
		if confirm == 'yes':
			break
		