public class psofRecursion {
    //q no 1
    public static void occurenceofkey(int arr[],int key,int i){
        
        //base
        if(i==arr.length){
            return ;
            
        }

        //kaam
        if(arr[i]==key){
            System.out.print(i+" ") ;          
        }
        occurenceofkey(arr, key, i+1);

    }
    //q n 2
    static String Digits[]={"zero","one","two","three","four","five","six","seven","eigth","nine"};
    public static void printdigits(int number){
        if(number==0){
            return;
        }
        int lastDigit=number%10;
        printdigits(number/10);
        System.out.print(Digits[lastDigit]+" ");
    }
    //q n 3
    public static int strlen(String str){
        if(str.length()==0){
            return 0;//no more nxt character
        }
        //kaam
        return length(str.substring(1))+1;


    }
    public static void  toh(int n,int A,int C,int B){
        if(n==1){
           // System.out.println("trnasfer disk "+n+" from "+A+" to "+B);
            return;
        }
        toh(n-1, A ,B ,C);
        System.out.println("moving "+n+" th disk from "+A+" to "+B);
        toh(n-1, B, C, A);
    


    }
    public static void main(String[] args) {
       // int arr[]={3,2,4,5,6,2,7,2,2};
        //occurenceofkey(arr, 2, 0);
        //System.out.println();
        //q 2
        //printdigits(12340);
        //System.out.println();
        //q 3
        //String str="apna college";
        //System.out.println(strlen(str));
        //toh
        int n=3;
        toh(n, 10, 30, 20);
        
    }
}
    

