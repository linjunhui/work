#include <iostream>

namespace {
    int a(3);
    void print() {
        std::cout << "未命名space直接调用" << std::endl;
    }
}

namespace run {
    int a(10);
    char *str("gogogo");
}

//命名空间起别名
namespace r = run;
int main(int argc, char *argv[])
{
    std::cout << "Hello World!" << std::endl;
    print();
    std::cout << r::str << std::endl;
    return 0;
}
