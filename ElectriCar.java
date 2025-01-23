
import java.util.Scanner;

public class psofOOP {
    public static void main(String[] args) {
        /*complex obj=new complex(2,3);
        Scanner sc=new Scanner(System.in);
        
        complex obj1=new complex(4,1);
        complex sum=complex.add(obj, obj1);
        complex sub=complex.diff(obj, obj1);
        complex mult=complex.product(obj,obj1);
        System.out.println("sum:"+sum);
        System.out.println(sub);
        System.out.println(mult);*/
        final Car car=new ElectriCar();
        System.out.println(car.drive());
        

        
    }
    
}
class complex{
    int real;
    int imag;
    complex(){

    }
    complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    static complex add(complex a,complex b){
        return new complex((a.real+b.real),(a.imag+b.imag));
        
    }
    static complex diff(complex a,complex b){
        return new complex((a.real-b.real),( a.imag-b.imag));
    }
    static complex product(complex a ,complex b){
        return new complex (((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public String toString() {
        return real + " + " + imag + "i";
    }
    
}
class vehicle{
    void print(){
        System.out.println("base class");
    }
}
class car extends vehicle{
    void print(){
        System.out.println("Derived class");
    }
}
class Automobile{
    private String drive(){
        return "driving vehcle";
    }

}
class Car extends Automobile{
    protected String drive(){
        return "car driving";
    }
}
public class ElectriCar extends  Car{
    public final String drive(){
        return "driving electric car";
    }
}
