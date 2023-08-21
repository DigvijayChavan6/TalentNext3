public class T4 {
    public static void main(String[] args) {
        int[] arr=new int[256];
        for(int i=0;i<arr.length;i++)arr[i]=i+1;
        for(int i : arr)System.out.print((char)i+" ");
    }    
}
