#include <iostream>

using namespace std;
class demo
{
private:
    int m;
public:
    int i;
    demo(){
        cout << "demo" << endl;
    }

    demo(const demo &it) {
        this->i = it.i;
        cout << "copy demo" << endl;
    }

    ~demo() {
        cout << "~demo" << endl;
    }

    void set_m(int m) {
        this->m = m;
    }

    int get_m(void) {
        return m;
    }
};

//调用时发生拷贝构造
void test(demo d) {
    //设置不到原对象
    d.set_m(900);
}

//没有拷贝构造，拿到的是原对象本身，使用引用代码效率增加
void test(const demo &d) {

}

//把对象作为返回值时
demo test() {
    demo d;
    cout << "在test中国 d= " << endl;
    return d;
}

//把引用作为返回值时
demo test() {
    demo d;
    cout << "在test中国 d= " << endl;
    return &d;
}

int main(int argc, char *argv[])
{
    demo d ; //声明一个类的实例，自动调用构造函数
    d.i = 10;//给成员变量赋值
    d.set_m(100);
    demo d1 = d; //这个操作调用导致了拷贝构造的调用,等效deme d1(d)
    //没有自己写拷贝构造，调用默认拷贝构造，一旦自己实现了拷贝构造函数，类成员之间的赋值就要自己完成
    cout << "d1.i = " << d1.i << endl;
    cout << "d1.m = " << d1.get_m() << endl;

    demo d2;
    d2 = d; //没有调用拷贝构造，简单的等号赋值,将内部的简单的值赋值给了d2
    cout << "d2.i = " << d2.i << endl;
    cout << "d2.m = " << d2.get_m() << endl;

    //对象作为返回值,没有发生拷贝构造，d3和test中的d指向同一对象
    //vs下发生了拷贝构造
    demo d3 = test();
    cout << "d3 的地址" << endl;
    cout << "Hello World!" << endl;
    return 0;
}
