package animal;

public class Wolf extends Animal {
    private String eat;
    public Wolf(String eat){
        super("go");
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Wolf : "
                + super.toString()
                + ", eat:" + eat;
    }
}
