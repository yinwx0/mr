package test;

public class yin01 {
    public static void main(String[] args) {
        String str0 = "OPPO Reno8";
        String str1 = "WiFi-6";
        String str2 = "2022-5-23";
        String str3 = "以官网信息为准";
        String str4 = "蓝牙5.3";
        double width=73.4;
        int length=160;
        double thickness=7.67;
        int weight=179;
        int colour=9;
        int runmemory = 12;
        int onbodymemory = 256;
        int battery = 4500;
        int charge =80;
        double large=6.43;
        System.out.println("主体\t\t\t" + "机型\t\t\t\t\t" + str0 + "\n");
        System.out.println("\t\t\t入网型号\t\t\t\t" + str1 + "\n");
        System.out.println("\t\t\t上市日期\t\t\t\t" + str2 + "\n");
        System.out.println("\t\t\t屏幕尺寸\t\t\t\t"+large+"英寸\n");
        System.out.println("\t\t\t蓝牙类型\t\t\t\t"+str4+"\n");
        System.out.println("基本信息\t\t" + "CPU型号\t\t\t\t" + str3 + "\n");
        System.out.println("\t\t\t机身尺寸\t\t\t\t"+"宽"+width+"mm\t"+"长"+length+"mm\t\t"+"厚"+thickness+"mm\n");
        System.out.println("\t\t\t机身重量\t\t\t\t"+weight+"g\n");
        System.out.println("\t\t\t机身颜色\t\t\t\t"+colour+"号\n");
        System.out.println("\t\t\t电池容量\t\t\t\t"+battery+"mAh\n");
        System.out.println("\t\t\t快充类型\t\t\t\t"+charge+"W\n");
        System.out.println("存储\t\t\t" + "运行内存\t\t\t\t" + runmemory + "GB\n");
        System.out.println("\t\t\t机身内存\t\t\t\t" + onbodymemory + "GB\n");
    }
}