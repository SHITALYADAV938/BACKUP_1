public class pairsarray {
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[i]+")");
                
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={2,5,7,4,8};
        printPairs(numbers);
       
        
    }
    
}
