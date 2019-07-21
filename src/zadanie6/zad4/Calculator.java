package zadanie6.zad4;

public class Calculator {
    public double grossPrice (Product product){
        switch (product.getCategory()){
            case "sport":
                return product.getNetPrice();
            case "AGD":
                return product.getNetPrice()*1.18;
            case "owoce":
                return  product.getNetPrice()*1.08;
                default:
                    return  product.getNetPrice()*1.23;
        }
    }

}
