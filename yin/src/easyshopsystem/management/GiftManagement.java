package easyshopsystem.management;

import java.util.Calendar;
import java.util.Random;

import static easyshopsystem.data.Customer.getCustInfo_N;
import static easyshopsystem.data.Customer.setCustInfo_N;
import static easyshopsystem.data.Data.DATA.*;
import static easyshopsystem.data.Gift.gifts;
import static easyshopsystem.data.Goods.getGOODS;
import static easyshopsystem.data.Goods.goodsGiving;
import static easyshopsystem.management.Menu.funMenu;
import static easyshopsystem.management.StartSMS.o;
import static easyshopsystem.management.StartSMS.scan;
import static easyshopsystem.management.VerifyEqual.flag;
import static easyshopsystem.management.VerifyEqual.verifyCust;

public class GiftManagement {
    static Random random = new Random();

    public static void fortuneGiving(String custName, String custPassword) {
        o.print(CN);
        String No_ = scan.next();
        if (verifyCust(No_)) {
            o.print("输入(1~" + getGOODS().size() + "):");
            int n = scan.nextInt();
            int scoreGot = goodsGiving(n);
            setCustInfo_N(No_, 1, Integer.parseInt(getCustInfo_N(No_, 1)) + "" + scoreGot);
            o.println(C + No_ + "获" + scoreGot + SC);
        } else {
            o.println(ER);
            funMenu(custName, custPassword);
        }
        if (flag()) funMenu(custName, custPassword);
    }

    public static void luckyLottery(String custName, String custPassword) {
        o.print(CN);
        String No_ = scan.next();
        int luckyNum = Integer.parseInt(No_) % 10;
        if (verifyCust(No_)) {
            int number = random.nextInt(100) * 100;
            if (number == 6666 || number == 8888) o.println(C + No_ + "获" + gifts[luckyNum]);
            else o.println("Thanks!");
        } else {
            o.println(ER);
            funMenu(custName, custPassword);
        }
        if (flag()) funMenu(custName, custPassword);
    }

    public static void birthGreeting(String custName, String custPassword) {
        o.print(CN);
        String No_ = scan.next();
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String birthDay = month + "/" + day;
        if (month < 10) birthDay = "0" + month + "/" + day;
        o.println("Current Date:" + year + "/0" + month + "/" + day);
        if (verifyCust(No_)) {
            if (birthDay.equals(getCustInfo_N(No_, 0))) o.println(C + No_ + " :Happy Birthday!");
            else o.println(NO);
        } else {
            o.println(ER);
            funMenu(custName, custPassword);
        }
        if (flag()) funMenu(custName, custPassword);
    }
}
