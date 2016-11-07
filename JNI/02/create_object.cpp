#include <iostream>

#include "CreateObject.h"
using namespace std;
JNIEXPORT void JNICALL Java_CreateObject_outputDate(JNIEnv *env, jclass obj) {
  		cout << "create object" << endl;
  		//1.拿到类
  		jclass clazz_date = env->FindClass("java/util/Date");

  		//2.拿到构造方法的methodID  构造函数 固定使用<init>	构造函数的签名()V 构造函数没有返回值
  		jmethodID mid_date_con = env->GetMethodID(clazz_date, "<init>", "()V");
  
  		//3.创建对象 类，构造函数，...参数
  		jobject now = env->NewObject(clazz_date, mid_date_con);

  		//调用 Date 中的getTime方法
  		//取得getTime的ID
  		jmethodID mid_date_getTime = env->GetMethodID(clazz_date, "getTime", "()J");
  		jlong time = env->CallLongMethod(now, mid_date_getTime);

  		cout << time << endl;

  		//方法二
  		jclass clazz_str = env->FindClass("java/lang/String");
  		jmethodID methodID_str = env->GetMethodID(clazz_str, "init", "([C)V");

  		//预先创建一个没有初始化的字符串
  		jobject string = env->AllocObject(clazz_str);

  		//创建一个 4个元素的字符数组，然后赋值
  		jcharArray arg = env->NewCharArray(4);
  		env->SetCharArrayRegion(arg, 0, 4, L"林俊晖~");

  		//调用构造函数
  		env->CallNonvirtualVoidMethod(string, clazz_str, methodID_str, arg);

  		jclass clazz_this = env->GetObjectClass(obj);

  		
  }