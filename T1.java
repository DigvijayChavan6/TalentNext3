public class T1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6};
        int sum=0;
        for(int i : arr)sum+=i;
        System.out.println("Sum of array is "+sum);
        System.out.println("Average is :"+(double)(sum/arr.length));
    }
}
