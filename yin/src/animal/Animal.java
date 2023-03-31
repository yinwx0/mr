package animal;

public class Animal {
    private String walk;
    public Animal(String walk){
        this.walk = walk;
    }

    @Override
    public String toString() {
        return "walk:" + walk;
    }
}

