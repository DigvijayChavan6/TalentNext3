class T10{
	public static void main(String []args){
		int[]  arr=new int[]{1,2,3,4,5,6};
		int[]  ans=new int[arr.length];
		for(int  o=arr.length-1,e=0,i=0;i<arr.length;i++){
			if(arr[i]%2==0)ans[e++]=arr[i];
			else ans[o--]=arr[i];			
		}
		for(int val : ans)System.out.print(val+" "); 
	}
}