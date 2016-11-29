package gzr.reflect;

import gzr.object.Chinese;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * getFields()��getDeclaredFields()���� ת���� http://mxdxm.iteye.com/blog/927990
 * Created by gaozengrong on 16/11/29.
 *
 * getFields()��getDeclaredFields()����:getFields()ֻ�ܷ�����������Ϊ���е��ֶ�,˽�е��ֶ����޷����ʣ��ܷ��ʴ�������̳����Ĺ��з���.getDeclaredFields()�ܷ����������е��ֶ�,��public,private,protect�޹أ����ܷ��ʴ�������̳����ķ���
 * getMethods()��getDeclaredMethods()����:getMethods()ֻ�ܷ�����������Ϊ���еķ���,˽�еķ������޷�����,�ܷ��ʴ�������̳����Ĺ��з���.getDeclaredFields()�ܷ����������е��ֶ�,��public,private,protect�޹�,���ܷ��ʴ�������̳����ķ���
 * getConstructors()��getDeclaredConstructors()����:getConstructors()ֻ�ܷ�����������Ϊpublic�Ĺ��캯��.getDeclaredConstructors()�ܷ����������еĹ��캯��,��public,private,protect�޹�
 */
public class Esg {
    public static void main(String[] args) {
        Class c1 = Chinese.class;

        Field[] fs = c1.getFields();
        System.out.println("*******getFields()*********");
        for (Field f : fs) {
            System.out.println(f.getName());
        }
        System.out.println("*******getDeclaredFields()*********");
        fs = c1.getDeclaredFields();
        for (Field f : fs) {
            System.out.println(f.getName());
        }
        System.out.println("*******getMethods()*********");
        Method[] md = c1.getMethods();
        for (Method aMd : md) {
            System.out.println(aMd.getName());
        }
        System.out.println("*******getDeclaredMethods()*********");
        md = c1.getDeclaredMethods();
        for (Method aMd : md) {
            System.out.println(aMd.getName());
        }

        System.out.println("*******getConstructors()*********");
        Constructor[] con = c1.getConstructors();
        for (Constructor aCon : con) {
            System.out.println(aCon.getName());
        }
        System.out.println("*******getDeclaredConstructors()*********");
        con = c1.getDeclaredConstructors();
        for (Constructor aCon : con) {
            System.out.println(aCon.getName());
        }
    }
}


