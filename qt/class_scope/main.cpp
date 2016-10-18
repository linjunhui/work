
#include <iostream>
#include "person.h"
using namespace std;

void test(void) {
    Person p;
}

int main(int argc, char *argv[])
{
    Person person;
    cout << person.get_name() << endl;
    //test();
    cout << "Hello World!" << endl;

    Person p1 = Person("Alice");
    cout << p1.get_name() << endl;

    Person p2 = Person("Kuki", 20);

    return 0;
}
