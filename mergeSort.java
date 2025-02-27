public class mergeSort {
    public static void conquer(int []arr,int strt,int mid,int end){
        int []sorted=new int[end-strt+1];
        int indx1=strt;
        int indx2=mid+1;
        int x=0;
        while(indx1<=mid && indx2<=end){
            if(arr[indx1]<arr[indx2]){
                    sorted[x]=arr[indx1];
                    x++;
                    indx1++;
            }else {
                sorted[x]=arr[indx2];
                x++;
                indx2++;
            }
        }

        while(indx1<=mid){
            sorted[x]=arr[indx1];
            x++;
            indx1++;
        }
        while(indx2<=end){
            sorted[x]=arr[indx2];
            x++;
            indx2++;
        }

        for(int i=0,j=strt;i<sorted.length;i++,j++){
            arr[j]=sorted[i];
        }
    }
    public static void divide(int []arr,int strt,int end){
        if(strt>=end){
            return;
        }
        int mid=strt+(end-strt)/2;
        divide(arr,strt,mid);
        divide(arr,mid+1,end);
        conquer(arr,strt,mid,end);
    }
    public static void main(String[] args) {
        int []arr={6,3,5,9,2,8};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }

        divide(arr,0,n-1);
        System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }

    }
}
