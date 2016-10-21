#include <iostream>
#include <stdlib.h>


int main(int argc, char *argv[])
{
    double db = 10.9;
    double *pdb = &db;
    auto num = pdb;

    //d =  double
    std::cout << typeid(db).name() << std::endl;
    //Pd = double *
    std::cout << typeid(num).name() << std::endl;
    //Pd = double *
    std::cout << typeid(pdb).name() << std::endl;

    decltype(db) numA(10.9);
    std::cout << sizeof(numA) << "    " << numA << std::endl;
    return 0;
}