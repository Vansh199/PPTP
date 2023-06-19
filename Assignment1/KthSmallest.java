public class KthSmallest{

    public static int partition(int[] arr,int l,int r){
        int x=arr[r],i=l;
        for(int j=l;j<=r-1;j++){
            if(arr[j]<=x){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i;
    }

    public static int smallest(int[] arr,int l,int r,int k){
        //if k is smaller than number of elements in array
        if(k>0 && k<=r-l+1){
            int pos=partition(arr,l,r);
        
        if(pos-l==k-1){
            return arr[pos];
        }
        if(pos-l>k-1){
            return smallest(arr, l, pos-1, k);
        }
        return smallest(arr, pos+1, r, k-pos+l-1);
       }
       return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
       int[] arr={12,3,5,7,1,19,26};
       int k=3;
        System.out.println(smallest(arr,0,arr.length-1,k));
    }
}