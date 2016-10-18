#include <iostream>
#include <string.h>

using namespace std;

class mystring {
public:
    char *s;
    mystring() {
        s = new char[1024];
        cout << "mystring" << endl;
    }

    mystring(const mystring &it) {
        s = new char[1024];
        memset(s, 0, 1024);
        strcpy(s, it.s);
    }

    ~mystring() {
        cout << "~mystring" << endl;
        delete []s;
    }

    void operator = (const mystring &it) {
        cout << "= operator" << endl;
        memset(s, 0, 1024);
        strcpy(s, it.s);
    }
};

int main(int argc, char *argv[])
{
    mystring str1;
    strcpy(str1.s, "hello, Jonson");
    mystring str2 = mystring(str1);

    mystring str3;
    str3 = str1;
    cout << "str2.s = " << str2.s << endl;
    cout << "Hello World!" << endl;
    return 0;
}
