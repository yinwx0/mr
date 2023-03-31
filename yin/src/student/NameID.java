package student;

public class NameID <B>{

    B nameid;

    public NameID(B nameid){
        this.nameid = nameid;
    }

    @Override
    public String toString() {
        return "NameID{" +
                "nameid=" + nameid +
                '}';
    }
}
