public class bitManipulation{
    public static void oddEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static int getIthbit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthbit(int n,int i){
        int bitMask=1<<i;
        return n| bitMask;
    }
    public static int clearIthbit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int updateIthbit(int n,int i,int newbit){
        //if(newbit==0){
         //   return clearIthbit(n, i);
        //}else{
          //  return setIthbit(n, i);
        //}
        n=clearIthbit(n, i);
        int bitmask=newbit<<i;
        return n | bitmask;
    }
    public static int clearLastIbit(int n,int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeBit(int n,int i,int j){
        int a=((~0))<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean ispowerof2(int n){
        return ((n)&(n-1))==0;
        }
    public static int countSetBit(int n){
        int count=0;
        while((n&1)!=0){
            count++;

        }
        n=n>>1;
        return count;
    }
    public static int fastExponential(int a,int n){
        int ans=0;
        while(n>0){
            if((n & 1) !=0){//check LSB
                ans=ans*a;

            }
            a=a*a;
            n=n>>1;

        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(fastExponential(5, 3));




    }
}