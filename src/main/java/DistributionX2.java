import java.util.ArrayList;

public class DistributionX2 extends DistributionAbstract {
    public DistributionX2(ArrayList<Double> initialX, int initialXsize) {
        super(initialX, initialXsize);
    }

    public void generateQuantityByDefault() {
        super.getQuatity().add(75);
        super.getQuatity().add(25);
    }
}

