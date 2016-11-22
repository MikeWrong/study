package gzr.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by gaozengrong on 16/11/22.
 */
public class Executor {
    public static void main(String[] args) throws InterruptedException {
        // ����һ���̶���С���̳߳�
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            System.out.println("�����߳�" + i);
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    System.out.println("�����߳�");
                }
            };
            // ��δ��ĳ��ʱ��ִ�и���������
            service.execute(run);
        }
        // �ر������߳�
        service.shutdown();
        // �ȴ����߳̽������ټ���ִ������Ĵ���
        service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        System.out.println("all thread complete");
    }
}
