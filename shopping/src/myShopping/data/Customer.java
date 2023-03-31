package myShopping.data;

//会员类

import java.util.Scanner;

public class Customer {

    private int custNo;
    //会员编号
    private String custBirth;
    //会员生日
    private int custScore;
    //会员积分


    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustBirth() {
        return custBirth;
    }

    public void setCustBirth(String custBirth) {
        this.custBirth = custBirth;
    }

    public int getCustScore() {
        return custScore;
    }

    public void setCustScore(int custScore) {
        this.custScore = custScore;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo=" + custNo +
                ", custBirth='" + custBirth + '\'' +
                ", custScore=" + custScore +
                '}';
    }
}

