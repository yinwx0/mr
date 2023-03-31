package stud;

import student.Studen;

public class Test1 {
    static Studen S1 = new Studen("23","A");
    static Studen S2 = new Studen("33","B");

    public static void main(String[] args) {
        if(S1.equals(S2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}