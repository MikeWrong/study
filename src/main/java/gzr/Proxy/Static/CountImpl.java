package gzr.Proxy.Static;

/**
 * ί����(����ҵ���߼�)
 * Created by gaozengrong on 16/11/28.
 */
public class CountImpl implements Count {
    @Override
    public void queryCount() {
        System.out.println("�鿴�˻�����...");
    }

    @Override
    public void updateCount() {
        System.out.println("�޸��˻�����...");
    }
}
