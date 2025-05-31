class EncapsulationProduct {
    private String productName;
    private String productId;
    private double price;
    private int stockQuantity;

    // Constructor
    public EncapsulationProduct(String productName, String productId, double price, int stockQuantity) {
        this.productName = productName;
        this.productId = productId;
        setPrice(price); 
        this.stockQuantity = stockQuantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    // Business Methods
    public void purchaseProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be positive.");
        } else if (quantity > stockQuantity) {
            System.out.println("Error: Not enough stock available.");
        } else {
            stockQuantity -= quantity;
            System.out.println("Purchase successful. " + quantity + " units sold.");
        }
    }

    public void restockProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Restock quantity must be positive.");
        } else {
            stockQuantity += quantity;
            System.out.println("Restocked successfully. " + quantity + " units added.");
        }
    }

    public void displayProductInfo() {
        System.out.println("\n--- Product Information ---");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public static void main(String[] args) {
        EncapsulationProduct product = new EncapsulationProduct("Lenevo LOQ", "15IRH8", 180000, 10);

        product.displayProductInfo();

        product.purchaseProduct(5);     
        product.purchaseProduct(15);     

        product.restockProduct(20);      

        product.setPrice(-10);           
        product.setPrice(155000);        

        System.out.println("\n... Final Product Info ...");
        product.displayProductInfo();
    }
}
