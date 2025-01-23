public class arrayPracticeSet {
    public static int  PQSet(int height[]){
        //Q 1
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;*/
        
        //Q 3
        /*int buyprices=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprices<prices[i]){
                int profit=prices[i]-buyprices;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyprices=prices[i];
            }
        }
        return maxprofit;*/
        int n=height.length;
        //calculate left boundary

        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right boundry
        int rightmax[]=new int[n];
        rightmax[0]=height[0];
        for(int i=1;i<n;i++){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;

    }

    public static void main(String[] args) {
        //Q 1
        //Example 1
        //int nums[]={1,2,3,1};
        //ex2
        //int nums[]={1,2,3,4};
        //ex3
        //int nums[]={1,1,1,3,3,4,3,2,4,2};
        //System.out.println(PQSet(nums));
        //Q 3
        /*int prices[]={7,1,5,3,6,4};
        System.out.println(PQSet(prices));*/
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(PQSet(height));
        

        
        
    }
    
}
