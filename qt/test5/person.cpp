#include <iostream>

#include "person.h"
using namespace std;
Person::Person()
{
    cout << "无参构造方法" << endl;
}

Person::Person(int age)
{
    cout << "构造方法，age = " << age << endl;
    this->age = age;
}

Person::Person(const char *s, int i)
{
    cout << "构造方法, name = " << s << "age = " << i << endl;
    this->age = i;

}
