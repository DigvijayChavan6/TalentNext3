public class T6 {
    public static void main(String[] args) {
        int[] arr=new int[]{34,2,5,23,13,67,3,4,234,13,4};
        for(int i=0;i<arr.length;i++){
            int p=i;
            for(int j=i;j<arr.length;j++)if(arr[p]>arr[j])p=j;
            int tp=arr[i];
            arr[i]=arr[p];
            arr[p]=tp;
        }
        System.out.print("Sorted array is ");
        for(int i : arr)System.out.print(i+" ");
    }
}
