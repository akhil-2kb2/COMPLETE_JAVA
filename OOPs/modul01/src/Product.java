public class Product {
    private int id;
    private String name;
    private double price;


    public Product(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }
//    public void setId(int id) {
//        // Validate the id
//        if (id < 0) {
//            System.out.println("ID must be a positive integer.");
//            return;
//        }
//        this.id = id;
//    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        // Validate the name
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be null or empty.");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setPrice(double price) {
//        // Validate the price
//        if (price < 0) {
//            System.out.println("Price cannot be negative.");
//            return;
//        }
//        this.price = price;
//    }

    public double getPrice() {
        return price;
    }

}