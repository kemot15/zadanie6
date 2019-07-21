package zadanie6.zad4;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Calculator calculator = new Calculator();

        product1.setName("Rower");
        product1.setDescription("gorski");
        product1.setNetPrice(1000);
        product1.setCategory("sport");

        product2.setName("banan");
        product2.setDescription("zielony");
        product2.setNetPrice(2.3);
        product2.setCategory("owoce");

        System.out.println(product1.showInfo() + calculator.grossPrice(product1));
        System.out.println(product2.showInfo() + calculator.grossPrice(product2));
    }



}
