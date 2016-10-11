#!/usr/bin/env python3
print('hello world')

name = input()

print(name)

print('I\'am not \"OK\"')

print('\\')

a = 'ABC'
b = a
a = 'XYZ'
print(b)
print(a)

print("True and False = ", True and False)

print("A`s ASCII:", ord('A'))

print("中 的编码是 ", ord('中'))

print("编码 66 对应的字符是：", chr(66))

print("编码25991 对应的字符是：", chr(25991))

print("使用16进制编码 \\u4e2d\\u6587：" ,'\u4e2d\u6587')

print("字节流b\'\\xe4\\xb8\\xad\\xe6\\x96\\x87\'解码：", b'\xe4\xb8\xad\xe6\x96\x87'.decode('utf-8'))

print("\'中文\' 编码后的长度：", len('中文'.encode('utf-8')))

print("HI , %s, you are $%d" % ('Michael', 10000))


print('100 + 200:', 100 + 200)

nm = input()

print('hello, ', nm)