package gzr.date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by gaozengrong on 16/11/22.
 */
public class DateUtil {
    public static void main(String[] args) {
        //获取第二天24点的时间
        System.out.println("第二天0点的时间为：" + getTomorrow24());
        Date now = new Date();
        System.out.println("下一个整点时间为：" + getWholePoint(now));

        Date startTime = new Date();
        Date endTime = new Date(startTime.getTime() + 20 * 60 * 60 * 1000);
        System.out.println("在" + startTime + "和" + endTime + "区间内的整点时间有：" + getWholePointInInterval(startTime,endTime));
    }

    /**
     * //获取第二天24点的时间
     * @return
     */
    private static Date getTomorrow24(){
        Calendar endTime = Calendar.getInstance();
        endTime.add(java.util.Calendar.DATE,1);
        endTime.set(java.util.Calendar.HOUR_OF_DAY, 24);
//        endTime.set(java.util.Calendar.HOUR, 24);
        endTime.set(java.util.Calendar.MINUTE, 0);
        endTime.set(java.util.Calendar.SECOND, 0);
        endTime.set(java.util.Calendar.MILLISECOND, 0);
        return endTime.getTime();
    }

    /**
     * Date转换为Calendar
     * @param date
     * @return
     */
    private static Calendar convertDateToCalendar(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 获取下一个整点的时间
     * @param date
     * @return
     */
    private static Date getWholePoint(Date date){
        Calendar calendar = convertDateToCalendar(date);
        calendar.add(Calendar.HOUR_OF_DAY,1);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar.getTime();
    }

    /**
     * 获取时间区间内的整点时间
     * @param startTime
     * @param endTime
     * @return
     */
    private static List<String> getWholePointInInterval(Date startTime, Date endTime){
        Date wholePoint = getWholePoint(startTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
        List<String> result = new ArrayList<>();
        while (wholePoint.before(endTime)){
            result.add(sdf.format(wholePoint));
            wholePoint = new Date(wholePoint.getTime() + 60 * 60 * 1000);
        }
        return result;
    }

}
