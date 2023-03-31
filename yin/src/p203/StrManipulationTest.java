package p203;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrManipulationTest extends Person {

    @Test
    void _matcher() {
    }

    @Test
    void _replace() {
    }

    @Test
    void _charAt() {
    }

    @Test
    void _replaceAll() {
    }

    @Test
    void _date() {
    }

    public static void main(String[] args) {
        StrManipulation strManipulation = new StrManipulation();
        String s1 = "MLDN中心Java技术学习班20130214";
        strManipulation._matcher("\\d{4}((0[1-9])|(1[012]))(0[1-9]|[12][0-9]|3[01])",s1);
        System.out.println("========================");
        String s2 = "MLDN JAVA高端技术培训";
        System.out.println(strManipulation._replace(s2,"JAVA","JAVA EE"));
        System.out.println("========================");
        String s3 = "Java技术学习班20130214";
        System.out.println(strManipulation._charAt(s3,8));
        System.out.println("========================");
        String s4 = "Java技术学习班20130214";
        System.out.println(strManipulation._replaceAll("0","",s4));
        System.out.println("========================");
        String s5 = "32102320040427042X";
        System.out.println(strManipulation._date(s5));
    }
}