class Placement{
	
	String collegeName;
	String branch;
	int noOfStudents;
	int noOfCompanies;
	int noOfStudentsPlaced;
	int noOfStudentsNotPlaced;
	String location;
	int noOfBranchesInCollege;
	int companyRating;
	int noOfStudentspassedOut;
	String companyName;
	String placementOfficerName;
	
	
	Placement(String collegeName,String branch,int noOfStudents,int noOfCompanies,int noOfStudentsPlaced,int noOfStudentsNotPlaced,String location,int noOfBranchesInCollege,int companyRating,int noOfStudentspassedOut,String companyName,String placementOfficerName){
		
		this.collegeName=collegeName;
		this.branch=branch;
		this.noOfStudents=noOfStudents;
		this.noOfCompanies=noOfCompanies;
		this.noOfStudentsPlaced=noOfStudentsPlaced;
		this.noOfStudentsNotPlaced=noOfStudentsNotPlaced;
		this.location=location;
		this.noOfBranchesInCollege=noOfBranchesInCollege;
		this.companyRating=companyRating;
		this.noOfStudentspassedOut=noOfStudentspassedOut;
		this.companyName=companyName;
		this.placementOfficerName=placementOfficerName;
	}
	
	void displayInfo(){
		
		System.out.println("Starting in display");
		System.out.println(this.collegeName);
		System.out.println(this.branch);
		System.out.println(this.noOfStudents);
		System.out.println(this.noOfCompanies);
		System.out.println(this.noOfStudentsPlaced);
		System.out.println(this.noOfStudentsNotPlaced);
		System.out.println(this.location);
		System.out.println(this.noOfBranchesInCollege);
		System.out.println(this.companyRating);
		System.out.println(this.noOfStudentspassedOut);
		System.out.println(this.companyName);
		System.out.println(this.placementOfficerName);
		System.out.println("Ending in display");
		
		System.out.println("Starting in display");
	}
	
}