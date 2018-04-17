import java.util.ArrayList;

public class XiClass {
    private int personQuantity;
    private int interviwQuantity;
    private ArrayList<Double> x1 = new ArrayList<>();
    private ArrayList<Double> x2 = new ArrayList<>();
    private ArrayList<Double> x3 = new ArrayList<>();

    XiClass(){
        personQuantity=100;
        interviwQuantity=10;
        //default time interval between appearance
        x1.add((double) 0);
        x1.add((double) 1);
        x1.add((double) 2);
        x1.add((double) 3);
        x1.add((double) 4);
        x1.add((double) 5);
//default yes/no
        x2.add((double) 0);
        x2.add((double) 1);
        //default duration of interview
        x3.add((double) 2);
        x3.add((double) 4);
        x3.add((double) 6);

    }

    public int getPersonQuantity() {
        return personQuantity;
    }

    public void setPersonQuantity(int personQuantity) {
        this.personQuantity = personQuantity;
    }

    public int getInterviwQuantity() {
        return interviwQuantity;
    }

    public void setInterviwQuantity(int interviwQuantity) {
        this.interviwQuantity = interviwQuantity;
    }

    public ArrayList<Double> getX1() {
        return x1;
    }

    public ArrayList<Double> getX2() {
        return x2;
    }

    public ArrayList<Double> getX3() {
        return x3;
    }
}
