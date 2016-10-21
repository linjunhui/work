
#include <iostream>

using namespace std;

class demo {
private:
    int i;
public:
    demo() {
        cout << "demo" << endl;
    }

    ~demo() {
        cout << "~demo" << endl;
    }

    friend void test();//意思是声明一个该类的友元函数
    friend class demo1;
};

//对于test来讲可以访问demo中的任意成员
void test() {
    demo d;
    d.i = 100;
}

class demo1 {
public:
    demo1() {
        demo d;
        d.i = 100;
    }

    friend class demo2;
};

class demo2 {
public:
    demo2() {
        //我朋友的朋友不是我的朋友
//        demo d;
//        d.i = 100;
    }
};

int main(int argc, char *argv[])
{
    demo d;
    cout << "Hello World!" << endl;
    return 0;
}
