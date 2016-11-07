#include <iostream>
using namespace std;
//面向过程，求圆的面积
int main01() {
	double r = 0;
	double s = 0;

	cout << "请输入圆形的半径:";

	cin >> r;

	cout << "r的值是：" << r << endl;

	s = 3.14*r*r;

	cout << "圆的面积是：" << s << endl;


	return 0;
}

//面向对象的方法求圆的面积
/*
	1.做抽象，定义一个圆数据类型
*/

struct Circle {
	double r;//半径
	double s;//面积
};

class MyCircle {
public:
	double r;//圆的半径
	double s;//圆的面积

public:
	void setR(double r) {
		this->r = r;
	}
	double getR() {
		return this->r; 
	}

	double getS() {
		s = 3.14 * r * r;
		return s;
	}

};
int main() {

	MyCircle c1, c2, c3;
	double r;

	cout << "请输入c1的半径：";
	cin >> r;
	c1.setR(r);

	cout << "c1圆形的面积是：" << c1.getS() << endl;
	return 0;
}