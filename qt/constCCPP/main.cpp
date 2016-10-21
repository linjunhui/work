#include <stdio.h>
#include <iostream>
// .c
//void main1() {
//    const int num = 5;
//    int a[num];//在c中不能这样写，num可以被修改
//    int *p = &num;

//    *p = 3; //c语言是弱类型

//    printf("hello ,Jonson\n");
//}

int main02() {
    const int num = 5;//const C++ 内部可以用于初始化数组

    int *p = (int *)&num;//（）强制转换，C语言的转换方式，跳过不执行
    *p = 4;

    int a[num];
    int i = 0;
    for(auto data: a) {
        data = i++;
        std::cout << data << std::endl;
    }

    return 0;
}

int main03() {
    const int num = 5;
    int *p = const_cast<int *>(&num);//强制去掉const属性

    *p = 4;//可以编译通过，禁止执行，还是无法修改num的值
    std::cout << num << std::endl;
}

void test(const int *i) {
    //*i = 40； 无法修改
    std::cout << "*i = " << *i << std::endl;
}

int main() {
    const int a = 20;//常量
    const int *b = &a;//指向常量的指针
    //*b = 30；错误，指向的是常量并不能被修改
    const int c = 30;//c也是常量
    b = &c; //b指向常量，但b本身是可变的

    std::cout << "a = " << a << std::endl;

    //int *const d = &a; 错误，类型不匹配，&a 是int *类型
    int e = 50;
    int *const d = &e; //指针常量，指针d是常量不能被修改
    int f = 100;
   // d = &f; 错误，无法修改d，指针d是常量

    //为权限的编程，只读不可写的权限 int const *p, C++强类型会忽略
    // &e 的类型 *e 形参类型const int*,保证e传入test值不被修改
    test(&e);


    //const int *const p3;
}
