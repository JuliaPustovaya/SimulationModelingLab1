import java.util.ArrayList;


public class ModelingAbstract {
    private ArrayList<Double> initialX = new ArrayList<>();
    private ArrayList<Double> p = new ArrayList<>(initialX.size());
    private ArrayList<Double> kumulativeP = new ArrayList<>(initialX.size());
    private ArrayList<Double> randomValue = new ArrayList<>(initialX.size());

    public ArrayList<Double> getInitialX() {
        return initialX;
    }

    public ArrayList<Double> getP() {
        return p;
    }

    public ArrayList<Double> getKumulativeP() {
        return kumulativeP;
    }

    public ArrayList<Double> getRandomValue() {
        return randomValue;
    }

}
