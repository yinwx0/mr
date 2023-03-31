package cla;

public class NagativeFundsException extends Exception{
    public NagativeFundsException(){
        System.out.println("存取款金额不能为负数!");
    }
}
