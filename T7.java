public class T7 {
    public static void main(String[] args) {
        int[] arr=new int[]{34,2,34,2,2,5,23,13,67,3,4,23,4,13,4};
        for(int i=0;i<arr.length;i++){
            int t=0;
            for(int j=0;j<i;j++)if(arr[i]==arr[j])t=1;
            if(t==0)System.out.print(arr[i]+" ");
        }
    }    
}
