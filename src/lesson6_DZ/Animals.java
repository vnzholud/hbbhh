package lesson6_DZ;

public class Animals {
    String name;
    String color;
    int age;
    int length;
    public void run(){
        System.out.println(name + " run!");
    }

    public void jump(){
        System.out.println(name + " jumped an obstacle at " + length + " meters" );
    }

    public void swim(){
        System.out.println(name + " swim.");
    }

}
