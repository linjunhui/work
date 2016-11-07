
#include "TestNative.h"
#include <iostream>

using namespace std;
JNIEXPORT void JNICALL Java_TestNative_sayHello(JNIEnv *env, jobject obj) 
{
	cout << "Hello Jonson!!!" << endl;
	//取得方法所在的类					完整的类名
	jclass clazz_TestNative = env->FindClass("TestNative");

	//取得methodID之后才能调用				类名,方法名，方法签名
	jmethodID id_func = env->GetMethodID(clazz_TestNative, "function", "(I)V");
 	
 	//调用方法 方法的返回值是void,传入方法的对象，方法的methodID, 参数
 	env->CallVoidMethod(obj, id_func, 99);

 	//取得属性
 	jfieldID  fieldID_prop = env->GetFieldID(clazz_TestNative, "property", "I");

 	jint proper_value = env->GetIntField(obj, fieldID_prop);
 	cout << "proper_value = " << proper_value << endl;

 	//
 	jfieldID id_number = env->GetFieldID(clazz_TestNative, "number", "I");

 	env->SetIntField(obj, id_number, 202);
 	jint number_value = env->GetIntField(obj, id_number);
 	cout << "cout--> number:" << number_value << endl;

 	//调用实例方法的三种形式 方法一最常用
 	// 方法一：1)先取得methodID 
 	jmethodID id_func_bool = env->GetMethodID(clazz_TestNative, "function", "(IDC)Z");
 	// 方法一：参数：java中的int 在C/C++中是Long， java中的Char两个字节 这里用宽字符
 	jboolean b = env->CallBooleanMethod(obj, id_func_bool, 100L, 3.44, L'3');


 	//方法二：var_list

 	//方法三：
 	/*union 维护足够的空间来置放多个数据成员中的“一种”，
 	而不是为每一个数据成员配置空间，在union 中所有的数据成员共用一个空间，
 	同一时间只能储存其中一个数据成员，所有的数据成员具有相同的起始地址
 	*/
 	jvalue *args = new jvalue[3];
 	args[0].i = 200L;
 	args[1].d = 5.88;
 	args[2].c = L'6';
 	env->CallBooleanMethodA(obj, id_func_bool, args);
 	delete [] args;
}	