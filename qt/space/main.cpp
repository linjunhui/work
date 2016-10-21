#include <iostream>



//命名空间
namespace myspace {
    int a(15);

    void printpa() {
        std::cout << "myspace papap" << std::endl;
    }
}

namespace myspaceA {
    int a(25);

    void printpa() {
        std::cout << "myspaceA papap" << std::endl;
    }
}
int main(int argc, char *argv[])
{
    int a(5);
    std::cout << "main a = " << a << std::endl;
    std::cout << "myspace a = " << myspace::a << std::endl;
    std::cout << "myspaceA a = " << myspaceA::a << std::endl;

    myspace::printpa();
    myspaceA::printpa();
    //cout << "Hello World!" << endl;
    return 0;
}
