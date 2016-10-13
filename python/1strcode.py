#!/usr/bin/env python3

print('包含中文的str')

#ord获取字符串的整数表示
print("ord('A') = ", ord('A'))

print("ord('A') = ", ord('中'))

# Unicode每个字符两个字节，这里是 '中文' 两个字
print("\'\\u4e2d\\u6587\' = ", '\u4e2d\u6587')

# 前缀b 表示bytes类型
x = b'ABC'
print(x[0])

# 字符串转为bytes bytes 就是byte数组 1个byte占一个字节
print('ABC'.encode('ascii'))

# utf-8 编码 3个字符一个汉字, 英文字符占一个字节
print('中文'.encode('utf-8'))


#len()函数计算str得字符数，如果换成bytes, len()函数就是计算字节数
print("len(b'ABC') = ", len(b'ABC'))
print("len('中文'.encode('utf-8')) = ", len('中文'.encode('utf-8')))

# 格式化输出  %用来格式化字符串
print('Hello, %s' % 'world')
print('Hi, %s, you have $%d' % ('Michael', 10000))

# 补位 与 小数位数
# %2d空格补位 %02d用0补位  %.2f打印两位小数 不清楚什么类型用%s 肯定起作用，打印%用%%
print('%2d-%02d-%.2f--%%' % (3, 1, 1.664334))