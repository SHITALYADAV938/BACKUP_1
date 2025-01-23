public class psarray2 {
    /**
     * @param nums
     * @return
     */
    /*public static int productofarray(int nums[]){
       int product;
       int n=nums.length;
       int result[]=new int[n];
       for (int i = 0; i < n; i++) {
        int product=1;
        for(int j=0;j<n;j++){
            if(j!=i){
                product=product*nums[i];
            }
        }
        result[i]=product;
        System.out.println("product of the arrya is:"+result);
    }*/
    public static int presufarray(int nums[]) {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        int suffix[]=new int[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i<n;i++){
            suffix[i]=suffix[i+1]*nums[i];
        }
        int res[]=new int[n];
        for(int i=1;i<n;i++){
            res[i]=prefix[i-1]*suffix[i+1];
            res[0]=suffix[i];
            res[n-1]=prefix[i];
        }
        System.out.println("Result is:"+res);
                return n;

        
    }

    public static void main(String[] args){
        int nums[]={2,6,9,4,7};
        presufarray(nums);

    }
    
}
