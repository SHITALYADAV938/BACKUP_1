public class binaryse {
 
    public static int binarysearch(int  numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparision
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,5,7,9};
        int key=2;
        System.out.println("element found"+binarysearch(numbers, key));
        
    }
    
}

    