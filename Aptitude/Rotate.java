class Rotate{
	
	
	static int rotateRight(int arr[],int rotate,int n){
		
		int temp[]=new int[rotate];
		
		for(int i=0;i<rotate;i++){
			
			temp[i]=arr[i];
			System.out.println("Creating temp array of size rotate "+temp[i]);
		}
		
		for(int i=rotate;i<n;i++){
			
			arr[i-rotate]=arr[i];
			System.out.println("Copyinf first element in temp "+arr[i-rotate]);
		}
		
		for(int i=0;i<rotate;i++){
			
			arr[i+n-rotate]=temp[i];
			System.out.println("Moving the rest elements "+arr[i+n-rotate]);
		}
		
		
	  return 0;
	}
	
	
	
}