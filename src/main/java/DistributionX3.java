import java.util.ArrayList;

public class DistributionX3 extends  DistributionAbstract{
    public DistributionX3(ArrayList<Double> initialX, int initialXsize) {
        super(initialX, initialXsize);
    }

    public void generateQuantityByDefault() {
        super.getQuatity().add(40);
        super.getQuatity().add(45);
        super.getQuatity().add(15);
    }
}
