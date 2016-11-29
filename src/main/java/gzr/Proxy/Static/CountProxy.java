package gzr.Proxy.Static;

/**
 * ����һ�������ࣨ��ǿCountImplʵ���ࣩ
 * �۲������Է���ÿһ��������ֻ��Ϊһ���ӿڷ�������һ�����򿪷��б�Ȼ���������Ĵ������ң����еĴ���������˵��õķ�����һ��֮�⣬�����Ĳ�����һ�������ʱ�϶����ظ����롣
 * Created by gaozengrong on 16/11/28.
 */
public class CountProxy implements Count {
    private CountImpl countImpl;

    /**
     * ����Ĭ�Ϲ�����
     */
    public CountProxy(CountImpl countImpl) {
        this.countImpl = countImpl;
    }

    @Override
    public void queryCount() {
        System.out.println("������֮ǰ");
        // ����ί����ķ���;
        countImpl.queryCount();
        System.out.println("������֮��");
    }

    @Override
    public void updateCount() {
        System.out.println("������֮ǰ");
        // ����ί����ķ���;
        countImpl.updateCount();
        System.out.println("������֮��");
    }
}
