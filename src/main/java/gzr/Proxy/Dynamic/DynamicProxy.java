package gzr.Proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK��̬���������  ������Բο�,д�ĺܺ� [InvocationHandler��invoke()�����ĵ�������](http://paddy-w.iteye.com/blog/841798)
 * Created by gaozengrong on 16/11/28.
 */
public class DynamicProxy implements InvocationHandler{
    private Object target;

    public Object bind(Object target){
        this.target = target;
        //ȡ�ô������
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);  //Ҫ�󶨽ӿ�(����һ��ȱ�ݣ�cglib�ֲ�����һȱ��)
    }
    /**
     * ���÷���
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("����ʼ");
        //ִ�з���
        result=method.invoke(target, args);
        System.out.println("�������");
        return result;
    }
}
