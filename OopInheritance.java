public class OopInheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.swim();
        shark.breathe();
        Mammals dobby=new Mammals();
        dobby.legs=4;
        System.out.println(dobby.legs);

        
    }
}
class Animal{
        
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("breathe");

    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}
class Mammals extends Animal{
    int legs;
    void legs(){
        System.out.println("legs");
    }
}

