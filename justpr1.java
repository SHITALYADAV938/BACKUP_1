public class justpr1 {
    public static int reverse(int numbers[]){
        int result;
        int n=numbers.length;
        int i=0;
        int j=n-1;
        while(i<j){
           
                int temp;
                temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                
            }result=numbers[i];
      }
    public static void main(String[] args){
        int numbers[]={3,5,7,2};
        
        System.out.println("result is:"+reverse(numbers));


    }
}
