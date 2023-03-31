package animal;

public class Goat extends Animal{
    private String eat = "草";
    public Goat(String eat){
        super("go");
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Goat : "
                + super.toString()
                + ", eat:" + eat;
    }
}
