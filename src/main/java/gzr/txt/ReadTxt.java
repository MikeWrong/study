package gzr.txt;

import com.google.common.base.Splitter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 * Created by gaozengrong on 16/11/21.
 */
public class ReadTxt {
    public static void main(String[] args) {
        String s;
        try {
            BufferedReader input = new BufferedReader(new FileReader("/Users/gaozengrong/Downloads/����ת���ɶ��ŵ�itemIds.txt")); //��ȡ��
            s = input.readLine();
            List<String> itemIds = Splitter.on(",").splitToList(s.trim());
            System.out.println(itemIds.size());
//            while((s = input.readLine())!=null){ //�ж��Ƿ���������һ��
//                String info[] = s.split("\t");
//                System.out.println("�ŵ�id:"+info[0]+"�id:"+info[1]+"�ŵ�����:"+info[2]+"���/ɾ��:"+info[3]);
//            }
            input.close();
        } catch (Exception ignored) {

        }
    }
}
