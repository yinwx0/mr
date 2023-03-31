package easyshopsystem.data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

import static easyshopsystem.data.Data.DATA.*;
import static easyshopsystem.management.Menu.custInfoManageMenu;
import static easyshopsystem.management.StartSMS.o;
import static easyshopsystem.management.StartSMS.scan;
import static easyshopsystem.management.VerifyEqual.verifyCust;

public class Customer<K, V> extends HashMap<K, V> {
    private static final Customer<String, String> customer = new Customer<>();
    private static final Customer<String, String[]> custInfo = new Customer<>();

    public static void setCustomer(String NO_, String password) {
        customer.put(NO_, password);
    }

    public static void setCustInfo(String N0_, String[] info) {
        custInfo.put(N0_, info);
    }

    public static void setCustInfo_N(String No_, int num, String info) {
        custInfo.get(No_)[num] = info;
    }

    public static Customer<String, String> getCustomer() {
        return customer;
    }

    public static Customer<String, String[]> getCustInfo() {
        return custInfo;
    }

    public static String getCustInfo_N(String No_, int num) {
        return custInfo.get(No_)[num];
    }

    public static void addCustInfo(String managerName, String managerPassword) {
        try {
            o.print(CN);
            String custNo = scan.next();
            o.print(BI);
            String custBirth = scan.next();
            o.print(SC);
            String custScore = scan.next();
            int score = Integer.parseInt(custScore);
            int No_ = Integer.parseInt(custNo);
            if (dateIsTrue(custBirth) && (score >= 0) && (No_ > 999 && No_ < 10000)) {
                customer.put(custNo, custNo);
                custInfo.put(custNo, new String[]{custBirth, custScore});
                o.print("添加成功\n继续添加(y/n):");
                String yes = scan.next();
                if (yes.equals("y")) addCustInfo(managerName, managerPassword);
                else custInfoManageMenu(managerName, managerPassword);
            } else {
                o.println(ER);
                addCustInfo(managerName, managerPassword);
            }
        } catch (Exception e) {
            o.println(ER);
            custInfoManageMenu(managerName, managerPassword);
        }
    }

    public static boolean dateIsTrue(String date) {
        return Pattern.matches(
                "^(0[1-9]|1[0-2])/(0[1-9]|^1[0-9]|2[0-9])|^(0[13-9]|1[0-2])/(30)|^(0[13578]|1[02])/31"
                , date);
    }

    public static void modifyInfo(String managerName, String managerPassword) {
        backToUp(managerName, managerPassword);
        o.print(CN);
        String custNo = scan.next();
        if (verifyCust(custNo)) {
            o.println(TT);
            o.println(custNo + "\t" + custInfo.get(custNo)[0] + "\t" + custInfo.get(custNo)[1]);
            modifyMap(custNo, managerName, managerPassword);
            o.println("修改其他(y/n):");
            String conf = scan.next();
            if (conf.equals("y")) modifyMap(custNo, managerName, managerPassword);
            else custInfoManageMenu(managerName, managerPassword);
        } else {
            o.println(ER);
            custInfoManageMenu(managerName, managerPassword);
        }
    }

    public static void modifyMap(String custNo, String managerName, String managerPassword) {
        backToUp(managerName, managerPassword);
        o.print(MDF);
        int select = scan.nextInt();
        switch (select) {
            case 1 -> {
                o.print(BI);
                String birth = scan.next();
                boolean dateIsTrue = dateIsTrue(birth);
                if (dateIsTrue) {
                    custInfo.get(custNo)[0] = birth;
                    o.println(DN);
                } else o.println(ER);
            }
            case 2 -> {
                try {
                    o.print(SC);
                    String score = scan.next();
                    if (Integer.parseInt(score) >= 0) {
                        custInfo.get(custNo)[1] = score;
                        o.println(DN);
                    } else o.println(ER);
                } catch (Exception e) {
                    o.println(ER);
                    modifyMap(custNo, managerName, managerPassword);
                }
            }
            default -> {
                o.println(ER);
                modifyMap(custNo, managerName, managerPassword);
            }
        }
    }

    public static void backToUp(String managerName, String managerPassword) {
        o.print("返回上层菜单(y/n):");
        String back = scan.next();
        switch (back) {
            case "y" -> custInfoManageMenu(managerName, managerPassword);
            case "n" -> o.println();
            default -> o.println(EX);
        }
    }

    public static void selectCustInfo() {
        o.print(CN);
        String custNo = scan.next();
        if (verifyCust(custNo)) {
            o.println(TT);
            o.println(custNo + "\t" + custInfo.get(custNo)[0] + "\t" + custInfo.get(custNo)[1]);
        } else {
            o.println(NO);
        }
    }

    @Override
    public String toString() {
        Iterator<Entry<K, V>> i = entrySet().iterator();
        if (!i.hasNext()) return NO.toString();
        StringBuilder s = new StringBuilder();
        s.append(TT).append("\n");
        for (; ; ) {
            Entry<K, V> e = i.next();
            K key = e.getKey();
            V value = e.getValue();
            String val = Arrays.toString((String[]) value)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "\t");
            s.append(key.toString()).append("\t").append(val).append("\n");
            if (!i.hasNext()) return s.toString();
        }
    }
}
