class ProjectStarter{
	
	public static void main(String... projects){
		
		System.out.println("Starting main in ProjectStarter");
		
		Person person=new Person();
		Developer developer=new Developer();
		Tester tester=new Tester();
		BusinessAnalyst businessanalyst=new BusinessAnalyst();
		ProductOwner productowner=new ProductOwner();
		DataBaseDeveloper databasedeveloper=new DataBaseDeveloper();
		Devops devops=new Devops();
		
		Project project=new Project();
		project.validate(person);
		project.validate(developer);
		project.validate(businessanalyst);
		project.validate(productowner);
		project.validate(devops);
		project.validate(tester);
		project.validate(databasedeveloper);
		
		
		System.out.println("Ending main in ProjectStarter");
	}
}