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
        DistributionAbstract distributionX = new ModelingAbstract(xiClass.getX1(), xiClass.getX1().size(),new DestributionByDefault().getQuantityX1());
     //  distributionX.generateQuantity(xiClass.getPersonQuantity(),xiClass.getX1().size());


        System.out.println("Время" + distributionX.getInitialX());
        System.out.println("Число" + distributionX.getQuatity());
        System.out.println("Вероятность" + distributionX.getP(distributionX.getQuatity(), xiClass.getPersonQuantity())+"\n");
        System.out.println("Кумулятивна" + ((ModelingAbstract) distributionX).getKumulativeP(distributionX.getP()));
        System.out.println("Случайные числа "+ ((ModelingAbstract) distributionX).getRandomValue());





    }


}
