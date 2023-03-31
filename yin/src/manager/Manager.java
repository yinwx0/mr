package manager;

public class Manager {
    private String name;
    private int passage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassage() {
        return passage;
    }

    public void setPassage(int passage) {
        this.passage = passage;
    }

    public void print(){
        System.out.print("姓名："+name);
        System.out.println("密码："+passage);
    }
}
