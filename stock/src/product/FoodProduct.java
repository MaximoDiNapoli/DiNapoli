package product;

public class FoodProduct {
    private int id;
    private String name;
    private int price;
    private int stock;

    public FoodProduct(){
    this.id = 1;
    this.name = "apple";
    this.price = 10;
    this.stock = 1;
    }

    public FoodProduct(int id, String name, int price, int stock) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}