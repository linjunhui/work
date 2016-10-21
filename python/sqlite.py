#!/usr/bin/env python3
# 导入SQLite驱动
import sqlite3
# 连接到sqlite数据库
# 如果文件不存在，会自动在当前目前创建
conn = sqlite3.connect('test.db')

# 创建一个光标 Cursor
cursor = conn.cursor()
# 执行一条SQL语句，创建user表
cursor.execute('create table user(id varchar(20) primary key, name varchar(20))')
# 继续执行一条sql语句，插入一条记录
cursor.execute('insert into user (id, name) values (\'1\', \'Michael\')')
#

cursor.close()

conn.commit()

conn.close()

conn = sqlite3.connect('test.db')
cursor = conn.cursor()

cursor.execute('select * from user where id=?', ('1', ))
values = cursor.fetchall()
print(values)
cursor.close()
conn.close()