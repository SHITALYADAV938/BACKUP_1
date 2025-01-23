public class psoftwoDim {
    public static void ps(int nums[][]){
        int n=nums.length;
        int countof7=0;
        for(int i=0;i<n;i++){
        for(int j=0;i<n-1;j++){
            if(nums[i][j]==7){
                countof7++;
            }
        }
    }

    }
    public static void main(String[] args) {
        int nums[][]={{4,7,8},{8,8,7}};
        ps(nums);


        
    }
    
}
