package gzr.Proxy.Dynamic;

/**
 * Created by gaozengrong on 16/11/28.
 */
public class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook() {
        System.out.println("����ͼ�鷽��������");
    }

    @Override
    public void reduceBook() {
        System.out.println("����ͼ�鷽��������");
    }
}
