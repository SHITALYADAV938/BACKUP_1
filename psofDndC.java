

public class psofDndC{
    /*public static void mergeSort(String arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        //divide
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        //combine
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String s3[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<=0){
                s3[k]=arr[i];
                i++;

            }else{
                s3[k]=arr[j];
                j++;
            }
            k++;
            
        }
        while(i<=mid){
            s3[k++]=arr[i++];
        }
        while(j<=ei){
            s3[k++]=arr[j++];
        }
        for(k=0,i=si;k<s3.length;k++,i++){
            arr[i]=s3[k];
        }
        
    }
    
    public static void print(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }*/
    //count
    public static int  mergeSort(int arr[],int si,int ei){
        int count=0;
        //base case
        if(si>=ei){
            return -1;
        }
        //kaam
        int mid=si+(ei-si)/2;
        //divide
        count+=mergeSort(arr, si, mid);
        count+=mergeSort(arr, mid+1, ei);
        //combine
        count+=merge(arr,si,mid,ei);
        return count;
    }
    public static int merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int ans=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;

            }else{
                ans+=(si-i);
                temp[k]=arr[j];
                j++;
            }
            k++;
            
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return ans;
        
        
    }
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        
        
        int arr[]={4,8,3,9,3,5,3,6,3};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
        
    
        
    }

}