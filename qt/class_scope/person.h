#ifndef PERSON_H
#define PERSON_H


class Person
{
private:
    char name[100];
    int age;
public:
    //一般用构造函数，初始化成员变量
    Person();
    //构造函数可以重载
    //Person(const char *s);
    //构造函数 默认参数写在 .h 头文件中
    Person(const char *, int i = 100);
    ~Person();
    void set_name(const char *s);
    void set_age(int i);
    const char *get_name(void);
    int get_age(void);
};

#endif // PERSON_H
