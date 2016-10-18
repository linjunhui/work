#include <iostream>
#include <string.h>
#include <stdlib.h>

#include "test.h"
using namespace std;
class man
{
public:
        char name[100];

private:
    int age;
    int sex;

};

//内联，不当函数处理了，相当直接把语句放到了mian中
//内联函数，不当函数使用，而是直接把内联函数代码嵌入到内联代码中
inline int mymax (int a, int b)
{
    if(a > b)
        return a;
    return b;
}

//引用传的就是一个变量的别名，int &c = a;c就是a的别名

// const i = 0 不可改变
// volatile int i = 0 不被优化
// C++ bool变量
int main(int argc, char *argv[])
{
    cout << "Hello World!" << endl;

    man m;

    int *p = (int *)malloc(sizeof(int));
    *p = 10;
    free(p);
//在堆，C++不建议使用malloc，建议使用new,使用完用delete删除
    int *q = new int;
    *q = 10;
    delete p;
// new 得同时也可以赋值
    int *w = new int(10);
    cout << *w << endl;

//创建动态的数组
    int *e = new int[10]; //10个int
    for(int i=0; i<10; i++) {
        e[i] = i;
    }

    for(int i=0; i<10; i++) {
        cout << e[i] << endl;
    }
    //释放动态数组的内存
    delete []p;

    for(int i = 0; i < 100; i++ ) {
        mymax(i, 10);
    }

    //c 就是a的引用，别名，而不是地址
    int a = 101;
    int &c = a; //引用赋值之后不能修改
    //打印出a和c的地址,a和c的地址完全一样，a就是c,只是名字不同
    printf("c = %p\na = %p\n", &c, &a);
    cout << c << endl;
// 当指针 p = NULL ,delete p不会错误
    strcpy(m.name, "tom");
    //m.age = 20;
    func();
    cout << m.name << endl;
    return 0;
}
