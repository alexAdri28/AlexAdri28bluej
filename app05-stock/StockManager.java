import java.util.ArrayList;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Alex Gordillo Adriano) 
 * @version (26/01/2021)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Removes a product from the list if it has a valid id
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.removeProduct(id);
        }
        else
        {
            printInvalidID();
        }
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.sell(amount);
        }
        else
        {
            System.out.println("invalid product id" + id);
        }
    }
    public void restockProduct(int id, int amount)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.increaseQuantity(amount);
        }
        else
        {
            System.out.println("not a valid item");
        }
    }
    
    public void searchProduct(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            System.out.println("Product found");
        }
        else
        {
            System.out.println("invalid item");
        }
    }

    /**
     * This method allows the appropriate product to be sold from using its unique id and by the quantity 
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);

        if(product != null)
        {
            product.sell(amount);
        }
    }

    public boolean isDuplicate(int id)
    {
        Product product = findProduct(id);
        if(product == null)
            return false;
        else
            return true;
    }

    /**
     * prints the name of the product
     */
    public void PrintName(String findName)
    {
        for(Product product : stock)
        {
            if(product.getName().contains(findName))
            {
                System.out.println(product);
            }
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberProductsInStock()
    {
        return stock.size();
    }

    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * This allows for a product to be renamed by inserting its unique id, and changing the name.
     */
    public void renameProduct(int id, String name)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.setName(name);
        }
        else
        {
            printInvalidID();
        }
    }

    /**
     * prints error message if returned with invalid product ID
     */
    private void printInvalidID()
    {
        System.out.println("Invalid product");
    }

    /**
     * prints name with a findName function
     */
    public void printName(String findName)
    {
        printHeading();
        System.out.println("products Names with: " + findName + " : ");
        for(Product product : stock)
        {
            if(product.getName().contains(findName))
            {
                System.out.println(product);
            }
        }
    }

    /**
     * This method will be used to print out all the stock
     */
    public void printAllProducts()
    {
        printHeading();
        for(Product product : stock)
        {
            //product.print();
            System.out.println(product);
        }
    }

    private void printHeading()
    {
        System.out.println();
        System.out.println("===================");
        System.out.println("Alex's stock list");
        System.out.println("===================");
        System.out.println();
    }

    /**
     * print function is used if product amount is low 
     */
    public void printLowStock()
    {
        for(Product product : stock)
        {
            if(product.getQuantity() < 5)
            {
                System.out.println("product stock low" + product.toString());
            }
        }
        System.out.println();
    }
}
