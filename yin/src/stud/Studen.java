package student;

import java.util.Objects;

public class Studen {
    private String sno;
    private String sna;
    public void setSno(String sno){
        this.sno = sno;
    }
    public Studen(String sno, String sna){
        this.sno = sno;
        this.sna = sna;
    }

    @Override
    public boolean equals(Object o) {
        Studen student = (Studen) o;
        if (this.sno.equals(student.sno)){
            return true;}
        else {
            return false;}
    }

    public String toString(){
        return "Studen{" +
                "sno = ' " + sno + '\'' +
                ",name = ' " + sna + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, sna);
    }
}
