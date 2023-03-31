package email;

public class EmailTest {
    public static void main(String[] args) {
        boolean a = Email.isValidEmail("www.3314572822@qq.com");
        System.out.println(a);
        boolean b = Email.isValidIPAddress("255.255.255.255");
        System.out.println(b);
    }

}
