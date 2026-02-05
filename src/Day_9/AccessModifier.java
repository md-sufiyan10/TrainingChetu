package Day_9;

class Modifier{
    private String name;
    private int x;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void show(){
        x++;
        System.out.println(x);
    }
}
public class AccessModifier {
    static void main() {
     Modifier m=new Modifier();
     m.setName("Sufi");

        System.out.println(m.getName());
        // System.out.println(m.name);
        m.show();


    }
}
