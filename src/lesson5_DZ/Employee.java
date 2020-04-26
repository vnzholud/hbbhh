package lesson5_DZ;

public class Employee {
    String name;
    String position;
    String email;
    String number;
    int salary;
    int age;

    public Employee(String name, String position, String email, String number, int salary , int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }


    public void information(){
        System.out.println(" " + name + " " + position + " " + email + " " + number + " " + salary + " " + age );
    }
public void work(){
    System.out.println(name + " work!");
}

}

