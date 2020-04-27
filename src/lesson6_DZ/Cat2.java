package lesson6_DZ;

public class Cat2 extends Animals {

    public Cat2(String name, String color, int age, int jump, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
        this.limitRun = 400;
        this.limitJump = 150;
    }
    //Метод плавания животного
    public void sail(){
        System.out.println(name + " can't swim");
        System.out.println("result: false");
    }
}
