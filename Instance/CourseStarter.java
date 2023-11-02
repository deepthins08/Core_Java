class CourseStarter{
	
	public static void main(String[] courses){
		
		System.out.println("Starting main in CourseStarter");
		
		Course course=new Course("Core Java","5 months",30000,50,2,"XYZInstitute",true);
		course.displayInfo();
		
		Course course1=new Course("DataScience","6 months",50000,30,1,"Jilebi Institute",true);
		course1.displayInfo();
		
		Course course2=new Course("Cloud Computing","4 months",45000,60,2,"Jamoon Institute",true);
		course2.displayInfo();
		
		Course course3=new Course("Cyber Security","7 months",40000,20,2,"Sandwitch Institute",true);
		course3.displayInfo();
		
		Course course4=new Course("Full Stack development","8 months",30000,100,3,"Pizza Institute",true);
		course4.displayInfo();
		
		Course course5=new Course("Front end development","6 months",35000,80,3,"Burger Institute",true);
		course5.displayInfo();
		
		Course course6=new Course("Back end development","6 months",45000,60,2,"Burfi Institute",true);
		course6.displayInfo();
		
		Course course7=new Course("Python","4 months",25000,120,2,"Peda Institute",true);
		course7.displayInfo();
		
		Course course8=new Course("Machine Learnig","3 months",30000,50,2,"Momo Institute",true);
		course8.displayInfo();
		
		Course course9=new Course("Artificial Intelligence ","7 months",50000,30,1,"Roll Institute",true);
		course9.displayInfo();
		
		Course course10=new Course("Web design","4 months",25000,40,2,"Vada Institute",true);
		course10.displayInfo();
		
		Course course11=new Course("DevOps","3 months",55000,30,1,"Steak Institute",true);
		course11.displayInfo();
		
		System.out.println("Starting main in CourseStarter");
	}
}