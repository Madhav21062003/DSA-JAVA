package oops.pkg_1;

public class Animal {
    void eat(){
        System.out.println("I am Eating");
    }
    static class Dog extends Animal{

        public static void main(String[] args) {
            Dog d = new Dog();
            d.eat();
        }
    }
}
