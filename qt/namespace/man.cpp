#include "man.h"
#include <string.h>
man::man()
{

}

void man::set_name(const char *s)
{
    strcpy(name, s);
}

void man::set_age(int i)
{
    age = i;
}

const char *man::get_name()
{
    return name;
}

int man::get_age()
{
    return age;
}
