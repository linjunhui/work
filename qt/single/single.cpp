#include "single.h"
#include <iostream>
using namespace std;
single *single::p = NULL;
single::single()
{

}

single *single::makesingle()
{
    if(p ==NULL )
        p = new single;
    return p;
}

void single::releasesingle()
{
    delete p;
    p = NULL;
}
