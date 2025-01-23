public class OOPPolymorphism {
    public static void main(String[] args){
        Student obj=new Student();
        obj.name="smv";
        Student obj2=new Student();
        System.out.println(obj2.schoolName);
    }
    
}
class calculator{
    int sum(int a,int b){
        return a+b;

    }
    float sum(float a,float  b){
        return a+b;
    }
}
//abstraction
class Animal{
    void eat(){
        System.out.println("animal eat");

    }
    abstract void walk();
}
class Deers extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
//interface
interface chess{
    void moves();
}
class Queen implements chess{
    public void move(){
        System.out.println("up,down,bottom,left ,right (by 4 moves)");
    }
}
class King implements chess{
    public void move(){
        System.out.println("bottom,left ,right (by 1 moves)");
    }
}
class  Rook implements chess{
    public void move(){
        System.out.println("left ,right ");
    }
}
//static keyword
class Student{
    String name;
    int rollNo;
    static String schoolName;
    void getName(){
        return this.name;
    }
    void setName(){
        this.name=name;
    }

}



