import java.util.*;
public class array {
    public static void main(String[] args) {
       int number[]=new int[100];
       Scanner sc=new Scanner(System.in);
       number[0]=sc.nextInt();
       number[1]=sc.nextInt();
       System.out.println("numberis");
       int percentage=(number[0]+number[1])/2;
       System.out.println(percentage);
    }
}
