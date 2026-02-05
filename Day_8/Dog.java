package TrainigChetu.Day_8;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    Dog(){}

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void bark(){
        System.out.println("Dog Barking...");
    }
    public void eat(){
        System.out.println("Dag Eating something...");
    }
    public void sleep(){
        System.out.println("Dark also sleeping...");
    }

    public void displayDetails(){
        System.out.println("==========Dog Details ================");
        System.out.println("Dog Name :"+name);
        System.out.println("Doge Breed:"+breed);
        System.out.println("Dog Age:"+age);
    }

}
