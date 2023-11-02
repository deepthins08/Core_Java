class TechnologyStarter{
	
	public static void main(String[] technologies){
		
		System.out.println("Starting main in TechnologyStarter");
		
		Technology technology=new Technology("Artificial Intelligence","Information Technology",4,"technology","MapReduce","c","html","linux","XMPP","Bootstrap","php","kafka");
		technology.displayInfo();
		
		Technology technology1=new Technology("Cybersecurity"," Security",1,"technology","Python","css","apache","XML","JavaScript","Cocoa","nodejs","DropWizard");
		technology1.displayInfo();
		
		Technology technology2=new Technology("IOT","Internet of things",2,"technology","GFS","c++","JavaScript","MYSQL","YAWS","Python","Html","HDFS");
		technology2.displayInfo();
		
		Technology technology3=new Technology("Cloud","Stroe",5,"technology","BigTable","video Technology","php","machinelearning","mochiweb","Bootstrap","css","Qwartz");
		technology.displayInfo();
		
		Technology technology4=new Technology("Devops","Developing",50,"technology","Kubernetes","VP9","java","AWS","Misultin","NoSQL","SQL","Azkaban");
		technology4.displayInfo();
		
		Technology technology5=new Technology("Robotics","AI",50,"technology","TensorFlow","H.264/MPEG-4","linux","Memecached","Cowboy","Java Kotlin","PHP","Hive");
		technology5.displayInfo();
		
		Technology technology6=new Technology("Automation","IT",50,"technology","Protocol Buffers","AVC video codes","apache","Redis","Riak","Swift","Go","Java");
		technology6.displayInfo();
		
		Technology technology7=new Technology("Full Stack Development","IT",5,"technology"," Spanner","Dynamic adaptive Streaming over http","mysql","Django","Erlang","Objective-C","Ruby","RoR");
		technology7.displayInfo();
		
		Technology technology8=new Technology("BlockChain","IT",50,"technology","java","angular js","HHVM","PostgreSQL","FreeBSD","Angular JS","Javascript","Python");
		technology8.displayInfo();
		
		Technology technology9=new Technology("Bigdata","IT",30,"technology","perl","php","Hack","Gunicorn","Yaws","JQuery","Javascript","PHP");
		technology9.displayInfo();
		
		Technology technology10=new Technology("DataScience","IT",20,"technology","Dijango","html","Haskell","Swift","PHP","Angular js","Node js","Javascript");
		technology10.displayInfo();
		
		Technology technology11=new Technology("Edge Computing","IT",10,"technology","Html","bootstrap","Erlang","css","PHP","GCM","Bootstrap js","HTML");
		technology11.displayInfo();
		
		System.out.println("Starting main in TechnologyStarter");
	}
	
}