package easyshopsystem.management;

import java.util.InputMismatchException;

import java.awt.Desktop;
import java.net.URI;

import static easyshopsystem.data.Data.DATA.*;
import static easyshopsystem.data.Goods.getGOODS;
import static easyshopsystem.management.CustManagement.*;
import static easyshopsystem.management.GiftManagement.*;
import static easyshopsystem.management.Pay.pay;
import static easyshopsystem.management.StartSMS.o;
import static easyshopsystem.management.StartSMS.scan;
import static easyshopsystem.management.VerifyEqual.*;

public class Menu {
    public static void startMenu() throws InputMismatchException {
        o.print(SA);
        try {
            String Num = scan.next();
            switch (Num) {
                case "1" -> {
                    o.print(CN);
                    String custName = scan.next();
                    o.print("密码(同用户名)/管理员密码:");
                    String custPassword = scan.next();
                    custHomeMenu(custName, custPassword);
                }
                case "2" -> {
                    o.print(MN);
                    String managerName = scan.next();
                    o.print(PW);
                    String managerPassword = scan.next();
                    managerHomeMenu(managerName, managerPassword);
                }
                case "3" -> {
                    o.print("waiting for exiting process\n.....................3");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            Thread.sleep(100);
                            o.print("\b");
                        }
                        for (int j = 0; j < 5; j++) {
                            Thread.sleep(100);
                            o.print(".");
                        }
                        o.print(2 - i + " ");
                        Thread.sleep(165);
                    }
                    o.print("\b\n" + EX);
                    Thread.sleep(100);
                    System.exit(0);
                }
                default -> {
                    o.println(WR);
                    startMenu();
                }
            }
        } catch (InputMismatchException e) {
            o.println(ER);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void custHomeMenu(String custName, String custPassword) {
        if (verifyCust(custName, custPassword)) {
            o.print(CH);
            String s = scan.next();
            switch (s) {
                case "1" -> payMenu(custName, custPassword);
                case "2" -> funMenu(custName, custPassword);
                case "3" -> startMenu();
                default -> {
                    o.println(ER);
                    custHomeMenu(custName, custPassword);
                }
            }
        } else {
            o.println(ER);
            startMenu();
        }
    }

    public static void managerHomeMenu(String managerName, String managerPassword) {
        if (verifyManager(managerName, managerPassword)) {
            o.print(MNH);
            String s = scan.next();
            switch (s) {
                case "1" -> custInfoManageMenu(managerName, managerPassword);
                case "n" -> startMenu();
                default -> {
                    o.println(EX);
                    managerHomeMenu(managerName, managerPassword);
                }
            }
        } else {
            o.println(ER);
            startMenu();
        }
    }

    public static void custInfoManageMenu(String managerName, String managerPassword) {
        o.print(CIM);
        String s = scan.next();
        switch (s) {
            case "1" -> {
                showAllInfo();
                if (flag()) custInfoManageMenu(managerName, managerPassword);
                else startMenu();
            }
            case "2" -> {
                showAllGOODS();
                if (flag()) custInfoManageMenu(managerName, managerPassword);
                else startMenu();
            }
            case "3" -> {
                addInfo(managerName, managerPassword);
                if (flag()) custInfoManageMenu(managerName, managerPassword);
                else startMenu();
            }
            case "4" -> {
                try {
                    o.print(GN);
                    int No_ = scan.nextInt();
                    o.print(GNM);
                    String name = scan.next();
                    o.print(P);
                    String price = scan.next();
                    addGOODSInfo(No_, name, price, managerName, managerPassword);
                    if (flag()) custInfoManageMenu(managerName, managerPassword);
                    else startMenu();
                } catch (Exception e) {
                    o.println(ER);
                    custInfoManageMenu(managerName, managerPassword);
                }
            }
            case "5" -> {
                modifyInfo_(managerName, managerPassword);
                if (flag()) custInfoManageMenu(managerName, managerPassword);
                else startMenu();
            }
            case "6" -> {
                modifyGOODSInfo_(managerName, managerPassword);
                if (flag()) custInfoManageMenu(managerName, managerPassword);
                else startMenu();
            }
            case "7" -> {
                selectInfo();
                if (flag()) custInfoManageMenu(managerName, managerPassword);
                else startMenu();
            }
            case "8" -> {
                try {
                    o.print(GN);
                    int No_ = scan.nextInt();
                    selectGOODSInfo(No_, managerName, managerPassword);
                    if (flag()) custInfoManageMenu(managerName, managerPassword);
                    else startMenu();
                } catch (Exception e) {
                    o.println(ER);
                    custInfoManageMenu(managerName, managerPassword);
                }
            }
            case "9" -> {
                try {
                    if(Desktop.getDesktop().isSupported(Desktop.Action.BROWSE))
                        Desktop.getDesktop().browse(URI.create(g(URL)));
                    o.println(DN);
                    if (flag()) custInfoManageMenu(managerName, managerPassword);
                    else startMenu();
                } catch (Exception e) {
                    o.println(ER);
                }
            }
            case "n" -> managerHomeMenu(managerName, managerPassword);
            default -> {
                if (flag()) managerHomeMenu(managerName, managerPassword);
                else startMenu();
            }
        }
    }

    public static void payMenu(String custName, String custPassword) {
        o.print(getGOODS());
        pay(custName, custPassword);
    }

    public static void funMenu(String custName, String custPassword) {
        o.print(FN);
        String s = scan.next();
        switch (s) {
            case "1" -> fortuneGiving(custName, custPassword);
            case "2" -> luckyLottery(custName, custPassword);
            case "3" -> birthGreeting(custName, custPassword);
            case "n" -> custHomeMenu(custName, custPassword);
            default -> {
                o.println(ER);
                custHomeMenu(custName, custPassword);
            }
        }
    }
}
