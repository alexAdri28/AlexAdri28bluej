import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Alex Gordillo Adriano.
 * @version 26.01.2021
 */

public class StockDemo

{
    // The stock manager.
    private StockManager manager;
    
    private Random generator = new Random();
    
    private int amount = 100;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101,  "Television"));
        manager.addProduct(new Product(102,  "Motorola android phone"));
        manager.addProduct(new Product(103,  "Washing machine"));
        manager.addProduct(new Product(104,  "LED"));
        manager.addProduct(new Product(105,  "Toshiba Laptop"));
        manager.addProduct(new Product(106,  "Belkin Router"));
        manager.addProduct(new Product(107,  "Wi-fi Extender"));
        manager.addProduct(new Product(108,  "Freezer"));
        manager.addProduct(new Product(109,  "Microwave"));
        manager.addProduct(new Product(110,  "Toaster"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
      manager.printAllProducts();
        
      int noProducts = manager.numberProductsInStock();
      
      int amount = 100;
      
      System.out.println("No of products in stock = " + noProducts);
      
      demoDeliverProducts();
      demoSellProducts();
    }
    
    /**
     *Sells the products with a maxmimum of 20 being the amount ordered 
     */
    private void demoSellProducts()
    {
      System.out.println("\nSelling all the products\n");
      System.out.println("============================");
      System.out.println();
      for(int id = 101; id <= 110; id++)
      {
          amount = generator.nextInt(20);
          manager.sellProduct(id, amount);
      }
        
      manager.printAllProducts();
    }
    
    /**
     * Delivers a maximum of 20 products, with a print functin to show a clear display 
     */
    private void demoDeliverProducts()
    {
      System.out.println("\nDelivering all the products\n");
      System.out.println("============================");
      System.out.println();
      for(int id = 101; id <= 110; id++)
      {
         amount = generator.nextInt(20);
         manager.delivery(id, amount);
      }
       
      manager.printAllProducts();
    }
    }