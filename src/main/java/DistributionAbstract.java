import java.util.ArrayList;
import java.util.Random;

/* пример
Время между появлениями 0       1       2      3      4    5
Число появлений         25    35      18      10      8    4 // рандомно берем,но чтобы в сумме ==кол-во опрашиваемых людей
Вероятность            0.25  0.35    0.18    0.10    0.8  0.4



*/
public class DistributionAbstract {
    public DistributionAbstract(ArrayList<Double> initialX, int initialXsize) {
        this.initialX = initialX;
        p = new ArrayList<>(initialXsize);
        this.quatity = new ArrayList<>(initialXsize);
    }

    public DistributionAbstract(ArrayList<Double> initialX, int initialXsize, ArrayList<Integer> destributionByDefault) {
        this.initialX = initialX;
        p = new ArrayList<>(initialXsize);
        quatity = destributionByDefault;
    }

    private ArrayList<Double> initialX;
    private ArrayList<Double> p;
    private ArrayList<Integer> quatity;

    public ArrayList<Double> getInitialX() {
        return initialX;
    }


    public ArrayList<Double> getP() {
        return p;
    }


    public ArrayList<Integer> getQuatity() {
        return quatity;
    }

    public void setQuatity(ArrayList<Integer> quatity) {
        this.quatity = quatity;
    }

    public void generateQuantity(int personQuantity, int initialXSize) {
        int sum = personQuantity;

        while (quatity.size() < initialXSize) {
            Random randNumber = new Random();
            int temp = randNumber.nextInt(sum);
            if (temp < sum) {
                if (quatity.size() == initialXSize - 1) {
                    quatity.add(sum);
                    return;
                }
                quatity.add(temp);
                sum = sum - temp;
            }

        }
    }


    public ArrayList<Double> getP(ArrayList<Integer> quatity, int personQuantity) {
        for (int i = 0; i < quatity.size(); i++) {
            p.add((quatity.get(i) / (double) personQuantity));
        }
        return p;
    }
}
