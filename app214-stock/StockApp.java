
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Hakeem Khares
 * @version 1.0
 */
public class StockApp
{
    private InputReader reader;

    private StockList stock;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();

        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = reader.getString(" Select Option ");

            finished = executeChoice(choice.toLowerCase());
        }
    }

    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            int id = reader.getInt("enter ID number");
            String name = reader.getString (" enter product name ");
            Product product = new Product(id,name);
            stock.add(product);
            System.out.println(" product " + product.getName() + " with ID "
                + product.getID() + " has been added successfully ");
        }
        else if(choice.equals("remove"))
        {
            int id = reader.getInt(" enter the ID of the item you wish to remove ");
            stock.remove(id);
            System.out.println(" product with ID " + id + " has been removed ");
        }
        else if(choice.equals("buy"))
        {
            int id = reader.getInt(" enter the ID of the item you wish to buy");
            int amount = reader.getInt (" How many would you like to buy? (1-10) ");
            
            if(1 <= amount && amount <= 10)
            {
                stock.buyProduct(id,amount);
                System.out.println("Successfully Bought " + amount + " " + id);
            }
            else
            {
                System.out.println(" Purchase Failed ");
            }
        }
        else if(choice.equals("sell"))
        {
            int id = reader.getInt("enter the ID of the item you wish to sell");
            int amount = reader.getInt (" How many would you like to sell? (1-10) ");
            if(1 <= amount && amount <= 10)
            {
                stock.sellProduct(id,amount);
                System.out.println("Successfully Sold " + amount + " " + id );
            }
        }
        else if(choice.equals("search"))
        {
            String phrase = reader.getString(" Enter product the produt name you are looking for ");
            stock.lookupProducts(phrase);
        }
        else if(choice.equals("stockbelow"))
        {
            int amount = reader.getInt("Please enter quantity you'd like to list (limit 1-5)");
            if(1 <= amount && amount <=5)
            {
                stock.stockBelow(amount);
            }
        }
        else if(choice.equals("restock"))
        {
            int quantity = reader.getInt("please enter restock amount (1-10)");
            int amount = reader.getInt("Please enter threshold you'd like to restock");
            {
                stock.reStockup(amount,quantity);
            }
        }
        return false;
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buy a product(s)");
        System.out.println("    Sell:       Sell a product(s)");
        System.out.println("    Search:     Searches for a product");
        System.out.println("    StockBelow: Lists stock below set amount");
        System.out.println("    Restockup:  Re-stock up a product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App214: Stock Application ");
        System.out.println("      by Hakeem Khares");
        System.out.println("********************************");
    }
}