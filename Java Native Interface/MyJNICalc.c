#include<jni.h>
#include<stdio.h>
#include"MyJNICalc.h"
JNIEXPORT jint JNICALL Java_MyJNICalc_add(JNIEnv* env,jclass cl,jint x,jint y)
{
	return x+y;
}
JNIEXPORT jint JNICALL Java_MyJNICalc_sub(JNIEnv* env,jclass cl,jint x,jint y)
{
	return x-y;
}