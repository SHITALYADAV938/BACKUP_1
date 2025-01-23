public class DivideNdConquer {
    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];//our indexing start from 0 so we add 1
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //if some element remains then add it
        //left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
        
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void quickSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int pIndex=partition(arr,si,ei);
        quickSort(arr, si, pIndex-1);
        quickSort(arr,pIndex+1, ei);



    }
    
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//to make space for element smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static int searchRotatedArr(int arr[],int tar,int si,int ei ){
        //kaam
        int mid=si+(ei-si)/2;
        //case found
        if(arr[mid]<=tar){
            return mid;

        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //left of L1
            if(arr[si]<=tar && tar<=arr[mid]){
                return searchRotatedArr(arr, tar, si, mid-1);//here mid-1 bcz of we check mid
            }
            //right of L2   
            else{
                return searchRotatedArr(arr, tar, mid+1, ei);
            }
        }else{
            //right of the L2
            if(arr[mid]>=tar && tar<=arr[ei]){
                return searchRotatedArr(arr, tar, mid+1, ei);
            }else{
                return searchRotatedArr(arr, tar, si, mid-1);
            }
        }

        }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int target=9;
        int tarIndx=searchRotatedArr(arr, target, 0, arr.length-1);

        System.out.println(tarIndx);
        
    }
}
