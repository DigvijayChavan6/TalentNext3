import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int[] arr=new int[]{9,45,2,23,5,66};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=s.nextInt();
        int re=-1;
        for(int i=0;i<arr.length;i++)if(arr[i]==n)re=i;
        System.out.println("Index of element is :"+re);
    }    
}
