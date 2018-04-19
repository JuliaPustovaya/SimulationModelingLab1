public class MainClass {
    public static void main(String[] args) {
        XiClass xiClass = new XiClass();
       /*   System.out.println("***Модель появления прохожих. Интервалы между моментами появления***".toUpperCase());
        DistributionAbstract distributionX1 = new DistributionX1(xiClass.getX1(), xiClass.getX1().size());
        // distributionX1.generateQuantity(xiClass.getPersonQuantity(),xiClass.getX1().size());
        ((DistributionX1) distributionX1).generateQuantityByDefault();

        System.out.println("Время" + distributionX1.getInitialX());
        System.out.println("Число" + distributionX1.getQuatity());
        System.out.println("Вероятность" + distributionX1.getP(distributionX1.getQuatity(), xiClass.getPersonQuantity())+"\n");


        System.out.println("***Продолжителность интервью***".toUpperCase());
        DistributionAbstract distributionX3 = new DistributionX3(xiClass.getX3(), xiClass.getX3().size());
        // distributionX3.generateQuantity(xiClass.getPersonQuantity(),xiClass.getX3().size());
        ((DistributionX3) distributionX3).generateQuantityByDefault();
        System.out.println("Продолжительность интевью " + distributionX3.getInitialX());
        System.out.println("Кол-во интевью " + distributionX3.getQuatity());
        System.out.println("Вероятность" + distributionX3.getP(distributionX3.getQuatity(), xiClass.getPersonQuantity())+"\n");

        System.out.println("***Желание дать интервью***".toUpperCase());
        DistributionAbstract distributionX2 = new DistributionX2(xiClass.getX2(), xiClass.getX2().size());
        // distributionX3.generateQuantity(xiClass.getPersonQuantity(),xiClass.getX3().size());
        ((DistributionX2) distributionX2).generateQuantityByDefault();
        System.out.println("Варианты ответов да-1/нет-0 " + distributionX2.getInitialX());
        System.out.println("Кол-во ответов" + distributionX2.getQuatity());
        System.out.println("Вероятность" + distributionX2.getP(distributionX2.getQuatity(), xiClass.getPersonQuantity())+"\n");

*/
        System.out.println("***Модель появления прохожих. Интервалы между моментами появления***".toUpperCase());
        DistributionAbstract X1 = new ModelingAbstract(xiClass.getX1(), xiClass.getX1().size(), new DestributionByDefault().getQuantityX1());
        System.out.println("Время" + X1.getInitialX());
        System.out.println("Число" + X1.getQuatity());
        System.out.println("Вероятность" + X1.getP(X1.getQuatity(), xiClass.getPersonQuantity()));
        System.out.println("Кумулятивна" + ((ModelingAbstract) X1).getKumulativeP(X1.getP()));
        System.out.println("Случайные числа " + ((ModelingAbstract) X1).getRandomValue()+ "\n");

        System.out.println("***Желание дать интервью***".toUpperCase());
        DistributionAbstract X2 = new ModelingAbstract(xiClass.getX2(), xiClass.getX2().size(), new DestributionByDefault().getQuantityX2());
        System.out.println("Варианты ответов да-1/нет-0 " + X2.getInitialX());
        System.out.println("Кол-во ответов" + X2.getQuatity());
        System.out.println("Вероятность" + X2.getP(X2.getQuatity(), xiClass.getPersonQuantity()) );
        System.out.println("Кумулятивна" + ((ModelingAbstract) X2).getKumulativeP(X2.getP()));
        System.out.println("Случайные числа " + ((ModelingAbstract) X2).getRandomValue()+ "\n");

        System.out.println("***Продолжителность интервью***".toUpperCase());
        DistributionAbstract X3 = new ModelingAbstract(xiClass.getX3(), xiClass.getX3().size(), new DestributionByDefault().getQuantityX3());
         System.out.println("Продолжительность интевью " + X3.getInitialX());
        System.out.println("Кол-во интевью " + X3.getQuatity());
        System.out.println("Вероятность" + X3.getP(X3.getQuatity(), xiClass.getPersonQuantity()));
        System.out.println("Кумулятивна" + ((ModelingAbstract) X3).getKumulativeP(X3.getP()));
        System.out.println("Случайные числа " + ((ModelingAbstract) X3).getRandomValue()+ "\n");


    }


}
