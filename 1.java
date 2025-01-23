public class 1 {
    public static void main(String[] args) {
        int mark[]=new int[100];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter marks of phy:");
        mark[0]=sc.nextInt();
        System.out.println("enter marks of che:");
        mark[1]=sc.nextInt();
        System.out.println("enter marks of math:");
        mark[2]=sc.nextInt();
        System.out.println(mark);
    }
}
