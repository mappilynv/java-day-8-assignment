public class Product {
    public String productName;
    public double productCost;
    public int productQuantity;


    public Product (String productName, double productCost, int productQuantity){
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }

    public void totalCost(){
        double total = productCost*productQuantity;
        System.out.println("Total cost is "+total);
    }

    public void printProduct(){
        System.out.println(productName+" costs "+productCost+" and "+productQuantity+" were purchased");
    }
}
