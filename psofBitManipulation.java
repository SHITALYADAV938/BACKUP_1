public class psofBitManipulation {

    public static void main(String[] args) {
        //swap two number using a variable
        /*int x=13,y=17;
        System.out.println("Before swap x :"+x+"Before swap y :"+y);
        //swap using XOR 
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap x:"+x+"After swap y:"+y);  
        //add 1 to integer
        int x=1;
        System.out.println(x+"+"+1+"is"+-~x);
        x=0;
        System.out.println(x+"+"+1+"is"+-~x);
        for(int ch='A';ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
        }*/
        int x=10;
        x=x & ~(1<<3);
        System.out.println(x);





 
    }
    
}
