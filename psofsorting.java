

public class psofsorting {
    public static void bubbleSort(Integer arr[]){
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    

        }
        public static void print(Integer arr[]){
            
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void selectionSort(Integer arr[]){
            for(int i=0;i<arr.length-1;i++){
                int minPos=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[minPos]>arr[j]){
                        minPos=j;
                    }
                }
                //swap
                int temp=arr[minPos];
                arr[minPos]=arr[i];
                arr[i]=temp;

            }


    }
    public static void insertionSort(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        Integer arr[]={3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr);
        print(arr);

    }
}
    