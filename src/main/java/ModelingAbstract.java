import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class ModelingAbstract extends DistributionAbstract {

    private ArrayList<Double> kumulativeP;
    private ArrayList<MinMaxRandom> randomValue;

    public ModelingAbstract(ArrayList<Double> initialX, int initialXsize) {
        super(initialX, initialXsize);
        this.kumulativeP = new ArrayList<>(initialX.size());
        this.randomValue = new ArrayList<>(initialX.size());
    }

    public ModelingAbstract(ArrayList<Double> initialX, int initialXsize, ArrayList<Integer> defaultQuantity) {
        super(initialX, initialXsize, defaultQuantity);
        this.kumulativeP = new ArrayList<>(initialX.size());
        this.randomValue = new ArrayList<>(initialX.size());
    }


    public ArrayList<Double> getKumulativeP(ArrayList<Double> p) {
        double sum = 0;
        for (int i = 0; i < p.size(); i++) {
            sum = sum + p.get(i);
            kumulativeP.add(new BigDecimal(sum).setScale(2, RoundingMode.UP).doubleValue());

        }
        return kumulativeP;
    }

    public ArrayList<Double> getKumulativeP() {
        return kumulativeP;
    }

    public ArrayList<MinMaxRandom> getRandomValue() {

        randomValue.add(new MinMaxRandom(0, (kumulativeP.get(0) * 100 - 1)));
        for (int i = 1; i < super.getInitialX().size(); i++) {

            randomValue.add(new MinMaxRandom(kumulativeP.get(i - 1) * 100, (kumulativeP.get(i) * 100 - 1)));
        }
        return randomValue;
    }

}
