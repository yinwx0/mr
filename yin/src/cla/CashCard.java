package cla;

public class CashCard {

    String no;
    double money;

    public CashCard(String no, double money) {
        this.money = money;
        this.no = no;
    }

    public void input(double in) throws NagativeFundsException {
        try {
            if (in >= 0) {
                System.out.println("明细(" + no + "," + money + ")");
                System.out.println("为(" + no + "," + money + ")" + "存钱：" + in);
                System.out.println("明细(" + no + "," + (money + in) + ")");
            } else {
                throw new NagativeFundsException();

            }
        } catch (NagativeFundsException e) {
            e.printStackTrace();
        }


    }

    public void output(double out) throws NagativeFundsException,InsufficientException{
        try {
            if (out < 0){
                throw new NagativeFundsException();
            }
            else if (out <= money) {
                System.out.println("明细(" + no + "," + money + ")");
                System.out.println("为(" + no + "," + money + ")" + "取钱：" + out);
                System.out.println("明细(" + no + "," + (money - out) + ")");
            } else {
                throw new InsufficientException();
            }
        } catch (InsufficientException | NagativeFundsException e) {
            e.printStackTrace();
        }

    }
}
