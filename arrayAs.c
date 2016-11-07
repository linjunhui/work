#include <stdio.h>

void fun(int a[]) {
	a[5] = 99;
}

int main(int argc, char const *argv[])
{
	int a[100];
	fun(a);

	printf("%d\n", a[5]);
	return 0;
}