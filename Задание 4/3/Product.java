public class Product {
    private int id;
    private String model;
    private String company;
    private int price;
    private static int maxId;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Product(String company, String model, int price) {
        this.id = this.maxId + 1;
        this.maxId++;
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {id: " + this.id + ", company: " + this.company + ", model: " + this.model + ", price: " + this.price + "}";
    }
}