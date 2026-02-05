package Day_7;

import java.util.Scanner;

class StudentsDetails{
    private String name;
    private int age;
    private String address;

    StudentsDetails(){
    }

    public StudentsDetails(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentsDetails {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
public class StudentsInfo {
    static void main() {
        Scanner scanner=new Scanner(System.in);

        StudentsDetails[] stu=new StudentsDetails[3];

        for (int i=0 ; i<3 ; i++){
            System.out.println("Enter Details for Students "+(i+1)+":");
            System.out.println("Enter Student Name:");
            String tempName= scanner.next();

            System.out.println("Enter Student Age:");
            int ageTemp=scanner.nextInt();

            System.out.println("Enter Student Address:");
            String addressTemp=scanner.next();

            stu[i]=new StudentsDetails(tempName,ageTemp,addressTemp);
        }
        System.out.println("=====Details Student=====");
        for (StudentsDetails student : stu){
            System.out.println(student);
        }

    }
}
