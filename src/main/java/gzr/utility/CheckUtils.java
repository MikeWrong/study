package gzr.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * У�麯�� ����ͨ��import staticע��
 *
 * @author zengrong.gzr
 * @date 2017/08/13
 */
public class CheckUtils {
    public static boolean notNullAndGreaterThanZero(Integer i) {
        return Optional.ofNullable(i).orElse(0) > 0;
        //return i != null && i > 0;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        System.out.println(isEmpty(list));

    }

    /**
     * У��Long��Integer��Short��long��int��short��ֵ�Ƿ�Ϊ���Ҵ���0
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> boolean nullOrLessThanZero(T t) {
        if (t == null) {
            return true;
        }
        //�������ͻᱻ��װ�ɶ�Ӧ�İ�װ��
        if (Integer.class.equals(t.getClass())) {
            return (Integer)t <= 0;
        } else if (Short.class.equals(t.getClass())) {
            return (Short)t <= 0;
        } else if (Long.class.equals(t.getClass())) {
            return (Long)t <= 0;
        } else {
            throw new RuntimeException("error class type!param type must be Integer��Long or Short.");
        }
    }

    /**
     * У���ַ����Ƿ�Ϊ�� ���� ���ȱȸ���ֵ��
     *
     * @param s         �������ַ���
     * @param maxLength �ַ����������󳤶�
     * @return
     */
    public static boolean emptyOrLonger(String s, int maxLength) {
        if (StringUtils.isBlank(s)) {
            return true;
        }
        s = s.trim();
        return s.trim().length() > maxLength;
    }

    /**
     * �ж��ַ���list�Ƿ�Ϊ�� ����˿��ַ��������ж�
     *
     * @param list
     * @return
     */
    public static Boolean isEmpty(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return true;
        }
        //ȡ�����ַ���������п�
        if (CollectionUtils.isEmpty(list.stream().filter(StringUtils::isNotBlank).collect(Collectors.toList()))) {
            return true;
        }
        return false;
    }

}
