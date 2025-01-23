public class printsubarray {
   /*  public static void subarray(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray="+ts);

    }*/
    //sumofmax sub array
    /*public static void maxsumsubarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            int start=i;
            ;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    //subarray sum
                    currsum+=numbers[k];

                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("max sum is:"+maxsum);

    }*/
    //sum in best case in above method time complexity is very worst so use another parallel method
    /*public static void maxsumsubarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                currsum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                System.out.println(currsum);
                
            }
        }
        System.out.println("max sum is:"+maxsum);
    
    }*/
    //another method i.e. kadanes algorith
    public static void kadanes(int numbers[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
            System.out.println(cs);
        }
        System.out.println("max sum is:"+ms);

    }
    public static void main(String[] args) {
        int numbers[]={3,5,8,9};
        kadanes(numbers);
        
    }
    
}
