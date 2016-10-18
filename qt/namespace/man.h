#ifndef MAN_H
#define MAN_H


class man
{
private:
    char name[100];
    int age;
public:
    man();
    void set_name(const char *s);
    void set_age(int i);
    const char *get_name(void);
    //在.h文件中实现函数，很有可能被编译器优化成inline
    int get_age(void);
};

#endif // MAN_H
