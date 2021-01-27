import java.util.Random;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Alex Gordillo Adriano
 * @version 0.1
 */

public class StockApp
{  
    // Use to get user input
    private InputReader input;

    private StockManager manager;

    private StockDemo demo;
    
    private Random generator = new Random();
    public int amount = 100;

    public int id;
    

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * Allows the basic commands to be run in the terminal, where quit will shut it down
     */
    public void run()
    {
        boolean finished = false;
        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getString();
            choice = choice.toUpperCase();
            if(choice.equals("QUIT"))
            {
                finished = true;
            }
            else
            {
                executeMenuChoice(choice);
            }
        }
    }

    /**
     * allows more commands to be used in the terminal, these commands are linked up to certain methods
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals("ADD"))
        {
            addProduct();
        }
        else if(choice.equals("REMOVE"))
        {
            removeProduct();
        }
        else if(choice.equals("PRINT"))
        {
            printAllProducts();
        }
        else if(choice.equals("DELIVER"))
        {
            deliverProduct();
        }
        else if(choice.equals("SEARCH"))
        {
            searchProduct();
        }
        else if(choice.equals("RESTOCK"))
        {
            restockProduct();
        }
    }

    /**
     * Enter quantity of product which is used for delivery function
     */
    private int enterQuantity()
    {
        System.out.println("enter amount");
        String quantity = input.getString();
        int amount = Integer.parseInt(quantity);
        return amount;
    }

    /**
     * Allows a product to be added to the list as well as its id
     */
    private void addProduct()
    {
        System.out.println("\nAdding a new product");

        System.out.println("Enter the product name");

        String name = input.getString();
        System.out.println("Enter a product ID");

        String value = input.getString();

        int id = Integer.parseInt(value);
        if(manager.isDuplicate(id))
        {
            System.out.println("Duplicate ID");   
        }
        else
        {
            Product product = new Product(id, name);

            manager.addProduct(product);

            System.out.println("\nNew Product added" + product + "\n");   
        }
    }
    
    /**
     * delivers products
     */
    private void deliverProduct()
    {
        System.out.println("\nDelivering Products");
        System.out.println("Enter a product ID");

        String value = input.getString();

        int id = Integer.parseInt(value);

        int amount = enterQuantity();

        manager.delivery(id, amount);
        

    }
    
    private void restockProduct()
    {
        System.out.println("\nRestocking Products");
        System.out.println("Enter a product ID");

        String value = input.getString();

        int id = Integer.parseInt(value);

        int amount = enterQuantity();

        manager.restockProduct(id, amount);
        

    }
    
    private void searchProduct()
    {
        System.out.println("\nSearching for Product"); 
        System.out.println("Enter product ID");

        String value = input.getString();

        int id = Integer.parseInt(value);
       
        
        manager.searchProduct(id);

    }
    
    /**
     * Removes old products by nullifying them and turning id to "0"
     */
    private void removeProduct()
    {
        System.out.println("\nRemoving the Product");
        System.out.println("Enter a product ID");

        String value = input.getString();

        int id = Integer.parseInt(value);

        System.out.println("\nRemoved Product");
        manager.removeProduct(id);
    }

    /**
     * prints all the products in the list 
     */
    private void printAllProducts()
    {
        manager.printAllProducts();
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Removes a product");
        System.out.println("    deliver:     delivers a product");
        System.out.println("    restock:     restocks a product");
        System.out.println("    search:     Searches for particular product");
        System.out.println("    Print:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Alex  Adriano");
        System.out.println("******************************");
    }
}
