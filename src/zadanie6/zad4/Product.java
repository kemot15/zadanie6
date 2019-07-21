package zadanie6.zad4;

public class Product {
    private String name;
    private String description;
    private double netPrice;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String showInfo (){
        Calculator calculator = new Calculator();
        return "Nazwa: " + name + "\nOpis: " + description + "\nCena netto: " + netPrice + "\nKategoria: " + category + "\nCena brutto: ";

    }
}
