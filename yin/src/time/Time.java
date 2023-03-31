package time;

import java.io.ObjectInputStream;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time(){
        System.out.println(System.currentTimeMillis());
    }

    public Time(long a){
        setTime(555550000);
    }

    public Time(int hour , int minute , int second){
    }
    public long getSecond() {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        return second;
    }
    public long getMinute() {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        return minute;
    }
    public long getHour() {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;
        return hour;
    }
    public void setTime(long elapseTime){
        //获得系统的时间，单位为毫秒,转换为妙
        long totalMilliSeconds = elapseTime;
        long totalSeconds = totalMilliSeconds / 1000;

        //求出现在的秒
        long currentSecond = totalSeconds % 60;

        //求出现在的分
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        //求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        //显示时间
        System.out.println("总毫秒为： " + totalMilliSeconds);
        System.out.println(currentHour + "小时" + currentMinute + "分钟" + currentSecond + "秒");
    }

    public static void main(String[] args){
        Time time = new Time();
        Time time1 = new Time(555550000);

    }
}
