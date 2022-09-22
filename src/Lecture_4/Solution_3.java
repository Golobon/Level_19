package Lecture_4;

public class Solution_3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Eat cat1 = new Cat();
        Eat.eat();
        Cat.eat();
        new Cat();
        Cat.eat();
        Solution_3.Eat.eat();
        Solution_3.Cat.eat();
    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        static void eat() {
            System.out.println("Iterf");
        }
    }

    static class Cat implements Movable, Edible, Eat {

        public void move() {

        }

        public void beEaten() {

        }

        public static void eat(){
            System.out.println("Class");
        }

    }

    class Dog implements Movable, Eat {
        public void move() {

        }

        public void eat(){
            System.out.println();
        }
    }

    class Mouse implements Movable, Edible {
        public void move() {

        }

        public void beEaten() {

        }
    }
}
