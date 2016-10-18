#include <iostream>
#include "man.h"
using namespace std;
int age = 10;

namespace lin {
    void func(int i) {
        cout << "lin func" << endl;
    }
}

//class man {
//private:
//    char name[100];
//    int age;
//public:
//    void set_name(const char *s)
//    {
//        strcpy(name, s);
//    }

//    void set_age(int i) {
//        //成员变量与全局变量同名默认访问的类成员，要使用全局变量用::，如 ::age = 100
//        //调用外部函数也用 ：：
//        age = i;
//    }

//    const char *get_name() {
//        return name;
//    }

//    int get_age() {
//        return age;
//    }
//};

//using namespace lin;
int main(int argc, char *argv[])
{
   // lin::func(10);

    man m;
    m.set_name("Jonson");
    //返回的指针变量，外部拿到指针后就可以修改成员了
    //要避免这种情况，返回类型用const修饰不让修改指针指向的内容
    char *p = (char *)m.get_name(); //强制转换后仍然能修改
    strcpy(p, "Queue");

    //就是数据成员的大小
    printf("man size = %d\n", sizeof(man));
    cout << m.get_name() << endl;

    cout << "Hello World!" << endl;
    return 0;
}
