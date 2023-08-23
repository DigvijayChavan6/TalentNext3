class T8{
	public static void main(String []args){
		int psum=0,tsum=0,t=0;
		int[]  arr=new int[]{1,6,4,7,9};
		for(int i=0;i<arr.length;i++){
			if( arr[i]==6||t==1){
				tsum+=arr[i];
				t=1;
			}
			psum+=arr[i];
			if(arr[i]==7&&t==1){
				psum-=tsum;
				t=0;
			}					
		}
		System.out.println("Desired sum is   : "+psum);
	}
}