package cla;

import com.sun.source.tree.ContinueTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CardApp {
    public static void main(String[] args) throws NagativeFundsException, InsufficientException {
        CashCard cashCard1 = new CashCard("A001",500);
        CashCard cashCard2 = new CashCard("A002",500);
        CashCard cashCard3 = new CashCard("A003",1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("out");
        cashCard1.output(scanner.nextInt());
        System.out.println("in");
        cashCard2.input(scanner.nextInt());




    }
}
