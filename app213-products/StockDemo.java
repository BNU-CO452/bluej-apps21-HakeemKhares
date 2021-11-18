import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Hakeem Khares
 * @version 1.0 , 15/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Apple iPhone 12"));
        stock.add(new Product(103, "Google Pixel 4A"));
        stock.add(new Product(104, "Samsung Galaxy S10"));
        stock.add(new Product(105, "Apple iPhone 13"));
        stock.add(new Product(106, "Samsung Galaxy S21"));
        stock.add(new Product(107, "Samsung Galaxy S21 Ultra"));
        stock.add(new Product(108, "Samsung Z Flip3"));
        stock.add(new Product(109, "Samsung Galaxy Buds2"));
        stock.add(new Product(110, "Apple AirProds Pro"));
        
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();   
        stock.print();
    }
    
    /**
     * This method will buy different quantities of each of the products
     * in the stock list.
     */
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 560);
        stock.buyProduct(103, 530);
        stock.buyProduct(104, 520);
        stock.buyProduct(105, 580);
        stock.buyProduct(106, 550);
        stock.buyProduct(107, 550);
        stock.buyProduct(108, 530);
        stock.buyProduct(109, 510);
        stock.buyProduct(110, 610);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 390);
        stock.sellProduct(102, 370);
        stock.sellProduct(103, 360);
        stock.sellProduct(104, 340);
        stock.sellProduct(105, 320);
        stock.sellProduct(106, 350);
        stock.sellProduct(107, 310);
        stock.sellProduct(108, 310);
        stock.sellProduct(109, 360);
        stock.sellProduct(110, 340);
    }    
}