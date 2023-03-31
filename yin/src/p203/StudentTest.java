package p203;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@SuppressWarnings("all")
class StudentTest extends Person {

    @Test
    void testToString() {
    }

    public static void main(String[] args) {
        Person person = new Person("MJ","街道 " +
                "翠竹路351号\n" +
                "区县 " +
                "京山县\n" +
                "城市 " +
                "荆门市\n" +
                "省 " +
                "湖北省\n"
                ,'男',20);
        Student student = new Student("MJ","街道 " +
                "翠竹路351号\n" +
                "区县 " +
                "京山县\n" +
                "城市 " +
                "荆门市\n" +
                "省 " +
                "湖北省\n"
                ,'男',20,90.0,80.0);
        System.out.println(person);
        System.out.println("================================================");
        System.out.println(student);
    }
}