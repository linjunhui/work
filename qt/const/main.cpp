#include <stdlib.h>
#include <iostream>

using namespace std;
//强制替换，没有明确类型
#define N = 10
int main(int argc, char *argv[])
{
    // 编译器为了保证常量绝对不被修改
    const int num = 100;
//没有对num取地址，num被编译器优化成#define
    int *p = const_cast<int*>(&num);
    *p = 4; //实际内存中的值被修改了
    cout << *p << endl;

    //直接引用常量，常量没有从内存读取
    cout << num << endl;

    cout << "Hello World!" << endl;
    return 0;
}
