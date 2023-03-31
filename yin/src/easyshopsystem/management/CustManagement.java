package easyshopsystem.management;

import static easyshopsystem.data.Customer.*;
import static easyshopsystem.data.Data.DATA.*;
import static easyshopsystem.data.Goods.*;
import static easyshopsystem.management.Menu.custInfoManageMenu;
import static easyshopsystem.management.StartSMS.o;
import static easyshopsystem.management.StartSMS.scan;

public class CustManagement {
    public static void showAllInfo() {
        o.println(getCustInfo());
    }

    public static void showAllGOODS() {
        o.println(getGOODS());
    }

    public static void addInfo(String managerName, String managerPassword) {
        addCustInfo(managerName, managerPassword);
    }

    public static void addGOODSInfo(int No_, String name, String price, String managerName, String managerPassword) {
        addGOODS(No_, name, price, managerName, managerPassword);
    }

    public static void modifyInfo_(String managerName, String managerPassword) {
        modifyInfo(managerName, managerPassword);
    }

    public static void modifyGOODSInfo_(String managerName, String managerPassword) {
        o.print(MGD);
        try {
            String s = scan.next();
            switch (s) {
                case "1" -> {
                    o.print(GN);
                    int No_ = scan.nextInt();
                    o.print(GNM);
                    String na = scan.next();
                    if (getGOODS().containsKey(No_)) modifyGOODS_0(No_, na, managerName, managerPassword);
                    else {
                        o.print(ER);
                        modifyGOODSInfo_(managerName, managerPassword);
                    }
                }
                case "2" -> {
                    o.print(GN);
                    int No_ = scan.nextInt();
                    o.print(P);
                    String pri = scan.next();
                    if (getGOODS().containsKey(No_)) modifyGOODS_1(No_, pri, managerName, managerPassword);
                    else {
                        o.print(ER);
                        modifyGOODSInfo_(managerName, managerPassword);
                    }
                }
                default -> {
                    o.print(ER);
                    modifyGOODSInfo_(managerName, managerPassword);
                }
            }
        } catch (Exception e) {
            o.print(WR);
            custInfoManageMenu(managerName, managerPassword);
        }
    }

    public static void selectInfo() {
        selectCustInfo();
    }

    public static void selectGOODSInfo(int No_, String managerName, String managerPassword) {
        selectGOODS_(No_, managerName, managerPassword);
    }
}
