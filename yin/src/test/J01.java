package test;

import student.Studen;

import java.util.Arrays;
import java.util.Scanner;

public class J01 {
    public static void main(String... args) {
        int v = 100_000_000;
        char c = '\u0000';
        char b = '\u0000';
        char c1 = b =c;
        int i = 11;
        i >>= 1;
        //final student.Student student = new student.Student("sno","sna");
        //System.out.println(i);
        //Integer integer = new Integer(1);
        //System.out.println(student);
        //student.setSno("s");
        //System.out.println(student);
        //j();
        //System.out.println(calc(100));
        Studen[] students = new Studen[3];
        students[0] = new Studen("l","");
        System.out.println(Arrays.toString(students));

    }
    static void j(String... strings){
        int length = strings.length;
        int[] ints = {0,0,1,2,3,4};
        //if (true) System.out.println();
        // else System.out.println();
        String s = "k";
        System.out.printf("%s",s);
        //System.out.println(s.trim());
        //System.out.println(Arrays.toString(ints).replace("[","").replace(",","").replace("]",""));
        //for (int i = 0; i < ints.length; i++) {
        //    System.out.println(ints[i]);
        //}
        //标签for
        OUT:
        for (int i = 0; i < ints.length; i++) {
            if (i==3) continue OUT;
            System.out.println(ints[i]);
        }
        //foreach
        for (Integer integer:ints) System.out.print(integer);
        switch (new Scanner(System.in).nextInt()){
            case 1 :
                System.out.println();
                break;
            default:
        }
    }
    public static int calc(int i){
        if (i==0)return 0;
        return i += calc(i-1);
    }
}
