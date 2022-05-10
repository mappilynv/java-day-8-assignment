public class Main {
    public static void main(String[] args) {
        Product kimchi = new Product("A jar of kimchi", 7.0, 50);
        kimchi.printProduct();
        kimchi.totalCost();

        Product seaweed = new Product("A pack of dry seaweed", 4.5, 4);
        seaweed.printProduct();
        seaweed.totalCost();
    }
}
