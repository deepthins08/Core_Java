class Tent{
	
	int slNo;
	Color color;
	double width;
	double height;
	
	
	
	boolean open(){
		
		System.out.println("tent is opened");
		return true;
	}
	
	boolean close(){
		System.out.println("tent is closed");
		return false;
	}
	
	void showInfo(int slNo,Color color,double width,double height){
		this.color=color;
		this.slNo=slNo;
		this.width=width;
		this.height=height;
		
		System.out.println("Starting showInfo in Tent");
		System.out.println("tent slNo is "+slNo);
		
		if(color!=null){
		System.out.println("tent color is "+color.RED);
		System.out.println("tent color is "+color.BLUE);
		System.out.println("tent color is "+color.PINK);
		}
		System.out.println("tent width is "+width);
		System.out.println("Ending showInfo in Tent");
	}
}