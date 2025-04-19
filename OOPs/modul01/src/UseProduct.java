public class UseProduct {
    public static void main(String[] args) {
        Product product = new Product( 1, "Cattle", 999.99);
        //product.setId(-1);
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());

        System.out.println("=========================");
        System.out.println("Updating product details...(Name)");
        System.out.println("=========================");
        product.setName("Laptop");
        //product.setPrice(-999.99);
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
    }
}