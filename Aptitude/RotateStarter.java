import java.util.Arrays;

class RotateStarter{
	
	
	public static void main(String[] args){
		
		System.out.println("Starting main in RotateStarter");
		int arr[]={1,2,3,4,5};
		int rotate=2;
		int n=arr.length;
		System.out.println(Rotate.rotateRight(arr,rotate,n));
		
			
			System.out.println("After Rotating an array "+Arrays.toString(arr)+" ");
		
		System.out.println("Starting main in RotateStarter");
	}
	
}