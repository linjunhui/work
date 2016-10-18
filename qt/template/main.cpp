#include <iostream>

using namespace std;

//要实现整数，浮点数的运算
//double myadd(double a, double b) {
//    return a + b;
//}
// 使用模板函数 泛型编程， 模板函数也可以重载
template < class T>
T myadd(T a, T b) {
    return a + b;
}

template < class T>
T myadd(T a) {
    return a;
}

int main(int argc, char *argv[])
{
    cout << "Hello World!" << endl;

    int a = 12;
    int b = 30;

    cout << myadd(a, b) << endl;

    double m = 1.1;
    double n = 5.56677;
    cout << myadd(m, n) << endl;
    cout << a << endl;
    return 0;
}
