#!/usr/bin/env python3

# dict 字典 也有语言中叫map 使用 key--value 存储

d = {'Michael':95, 'Bob':75, 'Tracy':85}
print("d['Michael'] = ", d['Michael'])

#dict 还可以根据key存入value
d['Michael'] = 100
print("d['Michael'] = ", d['Michael'])

# 如果key不存在就会报错
# d['Sarah']
# 判断 key 是否存在
print("'Thomas' in d :", ('Thomas' in d))

# 通过dict提供的get方法，如果key不存在，可以返回None，或者自己指定的value
print("d.get('Thomas') = ", d.get('Thomas'))
print("d.get('Thomas', -1) = ", d.get('Thomas', -1))

# 使用pop(key) 删除一个key，同时value也从dict中删除
d.pop('Bob')
print('d = ', d)

# key必须是不可变对象，list是可变得就不能做key

# set也是一组key的集合，但不存储value，key是不能重复的
# 要创建一个set，需要提供一个list作为输入集合
s = set([1, 2, 3])
print("s = ", s)

# 过滤重复的元素
s = set([1, 2, 2, 3, 3, 4])
print("s = ", s)

# 使用add(key)添加元素到set中，可以重复添加，但没有效果
s.add(4)
s.add(5)
print("s = ", s)

# 通过remove(key) 可以删除元素
s.remove(1)
s.remove(2)
print("s = ", s)

# set 可以做交集 并集运算
s1 = set([1, 2, 3])
s2 = set([2, 3, 4])

print("s1 = %s, s2 = %s" % (s1, s2))
print("s1 & s2 = ", (s1 & s2))
print("s1 | s2 = ", (s1 | s2))

# str 是不可变对象 list是可变对象
a = b = "abc"
a.replace('a', 'A')
#字符串本身没有变，而是产生了一个新的字符串
print("a = %s, b = %s, a.replace('a', 'A') = %s" % (a, b, a.replace('a', 'A')))