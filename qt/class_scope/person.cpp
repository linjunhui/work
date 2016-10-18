#include <iostream>
#include "person.h"

using namespace std;
//一个类实例化 为一个对象时 自动调用
//一般用构造函数，初始化成员变量 ,java会给成员变量默认值，C++不会
//const 成员常量必须在初始化成员列表
//初始化成员列表只能在 构造函数 使用
//引用 必须在初始化成员列表 赋值
Person::Person():age(1)
{
    strcpy(name, "Jonson");
    age = 100;
    cout << "person" << endl;
}

Person::Person(const char *s, int i)
{
    cout << s << i << endl;
    strcpy(name, s);
    age = i;
    cout << "person" << endl;
}

//Person::Person(const char *s)
//{
//    strcpy(name, s);
//}
//构造函数中分配了 内存， 析构函数就要释放内存
Person::~Person()
{
    cout << name <<"~person" << endl;
}

void Person::set_name(const char *s)
{

}

void Person::set_age(int i)
{

}

const char *Person::get_name()
{

}

int Person::get_age()
{

}
