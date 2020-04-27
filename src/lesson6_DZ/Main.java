package lesson6_DZ;

public class Main {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("Merle", "White", 4, 10, 499 ,45);
        Dog1 dog1 = new Dog1("Travis", "Black", 2, 30, 300 , 11);


        cat1.jump();
        dog1.jump();

        cat1.sail();
        dog1.sail();

        dog1.run();
        cat1.run();

        Dog2 dog2 = new Dog2("Deneb","Red", 5, 90,680,15 );
        Cat2 cat2 = new Cat2("Drake", "Grey", 3, 100, 200, 10);

        dog2.sail();
        cat2.sail();

        dog2.jump();
        cat2.jump();

        dog2.run();
        cat2.run();
    }
}
