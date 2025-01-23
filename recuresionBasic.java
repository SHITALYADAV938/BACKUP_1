

public class recuresionBasic {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return; 
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*factorial(n-1);
        return fn;

    }
    public static int  sum(int n){
        if(n==1){
            return 1;
        }
        int snm1=sum(n-1);
        int sn=n+sum(n-1);
        return sn;

    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;

        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static int  firstOccu(int arr[],int key,int i){
        if(i==arr.length){
            return -1;//not found
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccu(arr, key, i+1);
        
    }
    public static int lastOccu(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccu(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;

    }
    public static int optimizePower(int x,int n){
        if(n==0){
            return 1;
        }
       // int halfPower=optimizePower(x, n/2)*optimizePower(x, n/2);
       int halfpower=optimizePower(x, n/2);
       int halfPower=halfpower*halfpower;
       
        //if n is odd 
        if(n%2 !=0){
            halfPower=x*halfPower;
        }
        return halfPower;

    }
    public static void main(String[] args){
        //int arr[]={1,2,3,4,4};
        //System.out.println(lastOccu(arr, 2,0));
        System.out.println(optimizePower(2, 3));


    }
    
}
