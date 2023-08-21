public class T5 {
    public static void main(String[] args) {
        int[] arr=new int[]{23,56,7,3,5,34,67,5,76};
        int m1=arr[0],m2=arr[1];
        int x1=0,x2=0;
        for(int i : arr){
            if(m1>i)m1=i;
            if(x1<i)x1=i;        
        }
        for(int i : arr){
            if(m2>i&&m1!=i)m2=i;
            if(x2<i&&x1!=i)x2=i;
        }
        System.out.println("Max is "+x1);
        System.out.println("Min is "+m1);
        System.out.println("Second Max is "+x2);
        System.out.println("Second Min is "+m2);
    }    
}
