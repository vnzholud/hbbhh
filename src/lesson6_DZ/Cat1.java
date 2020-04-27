package lesson6_DZ;

public class Cat1 extends Animals {

    public Cat1(String name, String color, int age, int jump, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
        this.limitRun = 200;
        this.limitJump = 200;
    }
    //Метод плавания животного
    public void sail(){
        System.out.println(name + " can't swim");
        System.out.println("result: false");
    }
}



