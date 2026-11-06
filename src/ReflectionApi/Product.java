package ReflectionApi;

public class Product {
    private String name="ritesh";
    private int  price;
    private String manufacturingDate;
    public Product(String name,int price,String manufacturingDate)
    {
        this.name=name;
        this.price=price;
        this.manufacturingDate=manufacturingDate;
    }
    public Product()
    {

    }
    private int getPrice()
    {
        return price;
    }
    private String getName(String naam)
    {
        return naam;
    }
    private String getManufacturingDate()
    {
        return manufacturingDate;
    }
    public void printMessage()
    {
        System.out.println("Printing Something");
    }
}
