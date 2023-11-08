class PersonStarter{
	
	
	public static void main(String[] poeple){
		
		System.out.println("Starting main in PersonStarter");
		
		Domain domain=Domain.GMAIL;
		
		Email email=new Email();
		email.setEmail(domain,"stephen@gmail.com","Stephen","Salvator");
		email.showInfo();
		String[] mail=new String[3];
		mail[0]="stephen@gmail";
		mail[1]="damon@gmail.com";
		mail[2]="taylor@gmail.com";
		System.out.println(mail);
		Person person=new Person();
		person.setMail(mail);
		person.name="Klevin";
		person.showInfo();
		
		System.out.println("Ending main in PersonStarter");
	}
}