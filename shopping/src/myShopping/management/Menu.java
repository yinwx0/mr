package myShopping.management;

import myShopping.data.Customer;
import myShopping.data.Goods;

public class Menu {

    //商品信息
    public Goods goods[] = new Goods[50];
    //会员信息
    public Customer customers[] = new Customer[100];

    //传递数据库
    public void setData(Goods[] goods, Customer[] customers){
        this.goods = goods;
        this.customers = customers;
    }

    //显示我行我素购物系统的登录菜单
    public void showLoginMenu(){
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("1. 登录系统");
        System.out.println();
        System.out.println("2. 更改管理员密码");
        System.out.println();
        System.out.println("3. 退出");
        System.out.println();
        System.out.println("*****************************************");
    }

    //显示我行我素购物系统的主菜单
    public void showMainMenu(){
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("1. 客户信息管理");
        System.out.println();
        System.out.println("2. 购物结算");
        System.out.println();
        System.out.println("3. 真情回馈");
        System.out.println();
        System.out.println("4. 退出");
        System.out.println();
        System.out.println("*****************************************");
    }

    //客户信息管理菜单
    public void showCustMMenu(){
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("1. 显示所有客户信息");
        System.out.println();
        System.out.println("2. 添加客户信息");
        System.out.println();
        System.out.println("3. 添加客户信息");
        System.out.println();
        System.out.println("4. 查询客户信息");
        System.out.println();
        System.out.println("*****************************************");
    }

    //显示我行我素购物系统的真情回馈菜单
    public void showSendGMenu(){
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("1. 幸运大放送");
        System.out.println();
        System.out.println("2. 幸运抽奖");
        System.out.println();
        System.out.println("3. 生日问候");
        System.out.println();
        System.out.println("*****************************************");
    }
}
