public class Product {
    public String productName;
    public double productCost;
    public int productQuantity;


    public Product (String productName, double productCost, int productQuantity){
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }

    public double totalCost(){
        return productCost*productQuantity;
    }

    public void printProduct(){
        System.out.println(productName+" costs "+productCost+" and "+productQuantity+" were purchased");
    }
}
