#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
    //int a = 5;
    int a(5);

    char *str = "1234";
    char *str1("chinae");
    //宽字符
    wchar_t *str2(L"china");
    wcout << str2 << endl;
    cout << a << endl;
    cout << "Hello World!" << endl;

   // system("puase"); Windows
    return 0;
}
