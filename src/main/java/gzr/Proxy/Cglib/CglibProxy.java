package gzr.Proxy.Cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * JDK�Ķ�̬�������ֻ�ܴ���ʵ���˽ӿڵ��࣬������ʵ�ֽӿڵ���Ͳ���ʵ��JDK�Ķ�̬����
 * cglib���������ʵ�ִ���ģ�����ԭ���Ƕ�ָ����Ŀ��������һ�����࣬���������з���ʵ����ǿ������Ϊ���õ��Ǽ̳У����Բ��ܶ�final���ε�����д���
 * Created by gaozengrong on 16/11/29.
 */
public class CglibProxy implements MethodInterceptor{
    private Object target;

    /**
     * �����������
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // �ص�����
        enhancer.setCallback(this);
        // �����������
        return enhancer.create();
    }

    @Override
    // �ص�����
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("���￪ʼ");
        proxy.invokeSuper(obj, args);
        System.out.println("�������");
        return null;


    }
}
