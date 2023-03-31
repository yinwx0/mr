package animal;

public class AnimalTest {
    static Goat G1 = new Goat("草");
    static Wolf W1 = new Wolf("肉");

    public static void main(String[] args) {
        System.out.print(G1.toString() + "\n" + W1.toString());
    }
}
