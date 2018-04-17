import java.util.ArrayList;

public class DistributionX1 extends DistributionAbstract {


    public DistributionX1(ArrayList<Double> initialX, int initialXsize) {
        super(initialX, initialXsize);
    }

    public void generateQuantityByDefault() {
        super.getQuatity().add(25);
        super.getQuatity().add(35);
        super.getQuatity().add(18);
        super.getQuatity().add(10);
        super.getQuatity().add(8);
        super.getQuatity().add(4);
    }
}
