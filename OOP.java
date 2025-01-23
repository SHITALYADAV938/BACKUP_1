

public class OOP {
    public static void main(String[] args) {
        /*Pen p1=new Pen();//created object of the class  here Pen() is constructor
        p1.setColor("blue");
        System.out.println(p1.getColor()); 
        p1.setTip(3);
        System.out.println(p1.getTip());  
        Pen p1=new Pen();*/  
        Student s1=new Student();
        s1.name="shital";
        s1.roll_no=123;
        s1.password="abc";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        s2.password="xyz"; 
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }  
    }
    
}
/*class Pen{
    String color;
    int tip;
    //creation
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
    //getter and setter
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip( ){
        return this.tip;
    }
    
    void setColor(String newColor){
        this.color=newColor;
    }
   
    void setTip(int newTip){
        this.tip=newTip;      //this keyword point the current object or variable it is more useful when two or more variable having same name
    }
    //constructor
    Pen(){
        System.out.println("Constructor is created");

    }*/
class Student{
    String name;
    int roll_no;
    String password;
    int marks[];
    //copy constructor
    //Student(Student s1){
     //   this.name=name;
       // this.roll_no=roll_no;
        //this.password=password;
        //this.marks=marks;
    //}
    //deep constructor
    Student(Student s1){
        marks=new int[3];
        this.name=name;
        this.roll_no=roll_no;
        this.password=password;
        for(int i=0;i<=3;i++){
            this.marks=s1.marks;
        }

    }
    Student(String name){
        this.name=name;
    }
    Student(int roll_no){
        this.roll_no=roll_no;
    }

    Student() {
        
    }


}

