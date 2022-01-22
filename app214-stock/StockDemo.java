/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Hakeem Khares
 * @version 1.0
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(001, "Apple"));
        stock.add(new Product(002, "Banana"));
        stock.add(new Product(003, "Pear"));
        stock.add(new Product(004, "Orange"));
        stock.add(new Product(005, "Kiwi"));
        stock.add(new Product(010, "Nuclear Warhead"));
        stock.add(new Product(020, "Bread"));
        stock.add(new Product(030, "Milk"));
        stock.add(new Product(040, "Sugar"));
        stock.add(new Product(050, "Salt"));
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
    
    private void buyProducts()
    {
        stock.buyProduct(001, 24);
        stock.buyProduct(002, 27);
        stock.buyProduct(003, 89);
        stock.buyProduct(004, 79);
        stock.buyProduct(005, 59);
        stock.buyProduct(010, 24);
        stock.buyProduct(020, 5);
        stock.buyProduct(030, 36);
        stock.buyProduct(040, 45);
        stock.buyProduct(050, 7);
    }
    
    private void sellProducts()
    {
        stock.sellProduct(001, 1);
        stock.sellProduct(002, 2);
        stock.sellProduct(003, 3);
        stock.sellProduct(004, 4);
        stock.sellProduct(005, 5);
        stock.sellProduct(010, 6);
        stock.sellProduct(020, 7);
        stock.sellProduct(030, 8);
        stock.sellProduct(040, 9);
        stock.sellProduct(050, 10);
    }    
}