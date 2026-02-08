package TrainigChetu.AssignmentOOPS;

class Product{
    private String name;

    Product(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    void display(){
        System.out.println("ProductName:"+name);
    }
}
class Laptop extends Product{
    private final String brand;
    Laptop(String name, String brand){
        super(name);
        this.brand = brand;
    }
    void display(){
        System.out.println("Laptop :"+getName() +" , Brand:"+brand);
      //  super.display();
    }
}
class Notes extends Product{
    private final String author;
    Notes(String name, String author){
        super(name);
        this.author = author;
    }
    void display(){
        System.out.println("Notes :"+getName() +" , Author:"+author);
    }
}
public class Problem_20_ProductDisplay {
    static void main() {
        Product[] shop={
                new Laptop("Dell", "Lenovo"),
                new Notes("Java","Sufi")
        };
        for(Product p:shop){
            p.display();
        }
    }
}
