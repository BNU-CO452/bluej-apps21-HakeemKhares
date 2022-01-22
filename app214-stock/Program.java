/**
 * Write a description of class Program here.
 *
 * @author Hakeem Khares
 * @version 1.0
 */

/**
 * the class blow contains main method and is activated first,
 * it creates a new StockApp and makes the app run.
 */
public class Program
{
    private static StockApp app;
    
    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}