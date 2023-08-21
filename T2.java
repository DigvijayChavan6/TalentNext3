public class T2 {
    public static void main(String[] args) {
        int[] arr=new int[]{3,12,56,4,24,6};
        int min=arr[0];
        int max=0;
        for(int i : arr){
            if(max<i)max=i;
            if(min>i)min=i;
        } 
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }    
}
