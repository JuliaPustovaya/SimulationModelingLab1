import java.util.ArrayList;

public class XiClass {
    private int personQuantity;
    private int interviwQuantity;
    private ArrayList<Double> x1 = new ArrayList<>();
    private ArrayList<Double> x2 = new ArrayList<>();
    private ArrayList<Double> x3 = new ArrayList<>();
    private ArrayList<Integer> x1Random = new ArrayList<>();
    private ArrayList<Integer> x2Random = new ArrayList<>();
    private ArrayList<Integer> x3Random = new ArrayList<>();

    public ArrayList<Integer> getX1Random() {
        return x1Random;
    }

    public ArrayList<Integer> getX2Random() {
        return x2Random;
    }

    public ArrayList<Integer> getX3Random() {
        return x3Random;
    }

    XiClass() {
        personQuantity = 100;
        interviwQuantity = 10;
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

        x1Random.add(3);
        x1Random.add(47);
        x1Random.add(43);
        x1Random.add(73);
        x1Random.add(86);
        x1Random.add(97);
        x1Random.add(74);
        x1Random.add(24);
        x1Random.add(67);
        x1Random.add(62);
        x1Random.add(16);
        x1Random.add(76);
        x1Random.add(62);
        x1Random.add(27);
        x1Random.add(66);
        x1Random.add(12);
        x1Random.add(56);
        x1Random.add(85);
        x1Random.add(9);
        x1Random.add(926);

        x2Random.add(35);
        x2Random.add(64);
        x2Random.add(16);
        x2Random.add(22);
        x2Random.add(77);
        x2Random.add(94);
        x2Random.add(39);
        x2Random.add(84);
        x2Random.add(42);
        x2Random.add(17);
        x2Random.add(53);
        x2Random.add(31);
        x2Random.add(63);

        x3Random.add(57);
        x3Random.add(29);
        x3Random.add(34);
        x3Random.add(12);
        x3Random.add(21);
        x3Random.add(33);
        x3Random.add(59);
        x3Random.add(78);
        x3Random.add(63);
        x3Random.add(1);


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
