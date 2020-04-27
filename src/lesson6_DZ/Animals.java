package lesson6_DZ;

public class Animals {
    String name; //Имя животного
    String color; //Окраска
    int age; //Во3раст
    int jump; //Прыжок
    int run; //Бег
    int swim; //Плавание
    int limitRun; //Максимальное расстояние для бега
    int limitJump; //Максимальное расстояние для прыжка
    int limitSwim; //Максимальное расстояние для плавания

    //Метод бега животного
    public void run(){
        if(run < limitRun){
            System.out.println(name + " running " + run + " meters");
            System.out.println("result: true");;
        } else {
            System.out.println(name + " can't run so much");
            System.out.println("result: false");
        }
    }

    //Метод прыжка животного
    public void jump(){
       if(jump < limitJump){
           System.out.println(name + " jumped an obstacle at " + jump + " centimeters" );
           System.out.println("result: true");;
       } else {
           System.out.println(name + "very high");
           System.out.println("result: false");
       }
    }

}