package cell;

public class Cell {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "name='" + name + '\'' +
                '}';
    }

    public void print(){
        System.out.println(name + "可以充电");
    }
}
