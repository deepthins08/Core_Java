class Course{
	
	String courseName;
	String duration;
	double fee;
	int noOfStudents;
	int noOfTrainers;
	String instituteName;
	boolean placement;
	
	Course(String courseName,String duration,double fee,int noOfStudents,int noOfTrainers,String instituteName,boolean placement){
		
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
		this.noOfStudents=noOfStudents;
		this.noOfTrainers=noOfTrainers;
		this.instituteName=instituteName;
		this.placement=placement;
		
		System.out.println("Creating Month with String,double,int,int,String,boolean argument constructor");
	}
	
	void displayInfo(){
		
		System.out.println("Starting in displayInfo");
		System.out.println("Course name is :"+this.courseName);
		System.out.println("Course duration is :"+this.duration);
		System.out.println("Course fee is :"+this.fee);
		System.out.println("noOfStudents taken course :"+this.noOfStudents);
		System.out.println("noOfTrainers train :"+this.noOfTrainers);
		System.out.println("instituteName is :"+this.instituteName);
		System.out.println("Placement is availbele? :"+this.placement);
		
		System.out.println("Starting in displayInfo");
	}
}