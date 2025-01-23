
import java.util.Scanner;

public class array1PS{
    public static void main(String[] args) {
        int n=5;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("enter element "+i+":");
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("length of the array is:"+arr.length);
        int key=23;
        
        //searching element
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("element found at"+i);
                break;
            }
            else{
                System.out.println("element not found");
            }
        }
        //binary search
        int low=0,high=arr.length;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                index= mid;
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else if(arr[mid]>>key){
                high=mid-1;
            }
            



        }
        if(index==-1){
            System.out.println("element found");

        }else{
            System.out.println("not found");
        }
    }
}