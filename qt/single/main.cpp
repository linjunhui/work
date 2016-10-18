#include <iostream>
#include "single.h"
using namespace std;

int main(int argc, char *argv[])
{
    single *s = single::makesingle();
    single *s1 = single::makesingle();

    single::releasesingle();
    printf("s = %p\ns1 = %p\n", s, s1);

    cout << "Hello World!" << endl;
    return 0;
}
