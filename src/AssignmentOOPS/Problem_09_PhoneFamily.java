package AssignmentOOPS;

class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {

        System.out.println(brand + " " + model + " is calling " + number + "...");
    }

    // Optional getters (encapsulation)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

class Smartphone extends Phone {
    private int cameraMP;

    public Smartphone(String brand, String model, int cameraMP) {
        super(brand, model);
        this.cameraMP = cameraMP;
    }

    public void cameraClick() {
        System.out.println("Photo captured with " + cameraMP + "MP camera.");
    }

    // Polymorphism (method overriding)
    @Override
    public void call(String number) {
        System.out.println("Smart call feature enabled.");
        super.call(number);
    }
}

public class Problem_09_PhoneFamily {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung", "S24", 50);

        // STEP 3: Test both methods on Smartphone
        myPhone.call("9876543210");
        myPhone.cameraClick();
    }
}
