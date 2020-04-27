package lesson6_DZ;

public class Dog2 extends Animals{


    public Dog2(String name, String color, int age, int jump, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
        this.limitRun = 700;
        this.limitJump = 100;
        this.limitSwim = 20;
    }
    //Метод плавания животного
    public void sail(){
        if(swim < limitSwim){
            System.out.println(name + " swim " + swim + " meters");
            System.out.println("result: true");;
        } else {
            System.out.println(name + " can't swim so much.");
            System.out.println("result: false");
        }
    }

}
