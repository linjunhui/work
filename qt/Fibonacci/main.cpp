#include <iostream>
#include <queue>
#include <cmath>

using namespace std;


int fib1(int index) { //递归实现
    if(index<1)
        return -1;
    if (index == 1 || index == 2)
        return 1;
     return fib1(index-1) + fib1(index-2);
}

//自上而下 bottom-up
int fib2(int index) {

    int f1 = 1;
    int f2 =1;
    int ft, ft1 = f1, ft2= f2;
    int count = 1;

    if(index<1)
        return -1;
    if (index == 1 || index == 2)
        return 1;

    while((index-2) != count) {
        ft = ft1 + ft2;
        ft2 = ft1;
        ft1 = ft;
        count ++;
    }
    return ft1+ft2;
}
//递归平方
struct Matrix {
    long long f11;
    long long f12;
    long long f21;
    long long f22;
};
//定义二阶矩阵乘法
Matrix mam(Matrix mat1, Matrix mat2) {
    Matrix matrix;

    matrix.f11 = (mat1.f11*mat2.f11 + mat1.f12*mat2.f21);
    matrix.f12 = (mat1.f11*mat2.f12 + mat1.f12*mat2.f22);
    matrix.f21 = (mat1.f21*mat2.f11 + mat1.f22*mat2.f21);
    matrix.f22 = (mat1.f21*mat2.f12 + mat1.f22*mat2.f22);

    return matrix;
}
Matrix Fibo(int m) {
    Matrix unitMat, retMat;
    unitMat.f11 = (long long)1;
    unitMat.f12 = (long long)1;
    unitMat.f21 = (long long)1;
    unitMat.f22 = (long long)0;

    if(m == 1) {
        retMat.f11 = (long long)1;
        retMat.f12 = (long long)1;
        retMat.f21 = (long long)1;
        retMat.f22 = (long long)0;
    }
}

int fib3(int index) {

    //如果是偶数
    if(index%2 == 0) {

    }
}

int main(int argc, char *argv[])
{
    fib2(6);
    cout << "Fib(6) = " << fib2(6) << endl;
    return 0;
}
