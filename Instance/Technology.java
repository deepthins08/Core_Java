class Technology{
	
	String name;
	String relatedIndustry;
	int noOflearners;
	String type;
	String technologyUsedInGoogle;//MapReduce,GFS,LInux,BigTable,Kubernetes,TensorFlow,Protocol Buffers,Spanner,java,perl,php
	String technologyUsedInYouTube;//python,c,c++,video technology,VP9,H.264/MPEG-4 AVC video codes,Dynamic adaptive Streaming over http
	String technologyUsedInFaceBook;//html,css,js,php,python,ruby,java,linux,apache,mysql,HHVM,Hack,Haskell,Erlang,C++,cassendra,HBase,MariaDB
	String technologyUsedInInstagram;//Linux,Apache,Mysql,PHP,Machine Learing,AWS,Memecached ,Redis,Django,PostgreSQL,Gunicorn,Swift
	String technologyUsedInWhatsApp;//XMPP,XML,YAWS,MochiWeb,Misultin,Cowboy,Mensia,CouchDB,Riak,Erlang,FreeBSD,Yaws,PHP,GCM,FCM,PostgreSQL
	String technologyUsedInSnapChat;//Bootstrap,Javascript,python,Cocoa touch,php,AWS,NoSQL,Java Kotlin,,Swift,Objective-C,Angular JS,JQuery
	String technologyUsedInLinkdin;//php,node JS,HTML,CSS,SQL,PHP,Go,Ruby,Javascript,Node js
	String technologyUsedInFlipkart;//Kafka,Dropwizard,HDFS,Quartz,Azkaban,Hive,Java,RoR,Python,PHP,Javascript,HTML,CSS,SCALA
	
	
	Technology(String name,String relatedIndustry,int noOflearners,String type,String technologyUsedInGoogle,String technologyUsedInYouTube,String technologyUsedInFaceBook,String technologyUsedInInstagram,String technologyUsedInWhatsApp,String technologyUsedInSnapChat,String technologyUsedInLinkdin,String technologyUsedInFlipkart){
		
		this.name=name;
		this.relatedIndustry=relatedIndustry;
		this.noOflearners=noOflearners;
		this.type=type;
		this.technologyUsedInGoogle=technologyUsedInGoogle;
		this.technologyUsedInYouTube=technologyUsedInYouTube;
		this.technologyUsedInFaceBook=technologyUsedInFaceBook;
		this.technologyUsedInInstagram=technologyUsedInInstagram;
		this.technologyUsedInWhatsApp=technologyUsedInWhatsApp;
		this.technologyUsedInSnapChat=technologyUsedInSnapChat;
		this.technologyUsedInLinkdin=technologyUsedInLinkdin;
		this.technologyUsedInFlipkart=technologyUsedInFlipkart;
		
		System.out.println("Constructor invoked");
	}
	
	void displayInfo(){
		System.out.println("Starting display");
		System.out.println(this.name);
		System.out.println(this.relatedIndustry);
		System.out.println(this.noOflearners);
		System.out.println(this.type);
		System.out.println(this.technologyUsedInGoogle);
		System.out.println(this.technologyUsedInYouTube);
		System.out.println(this.technologyUsedInFaceBook);
		System.out.println(this.technologyUsedInInstagram);
		System.out.println(this.technologyUsedInWhatsApp);
		System.out.println(this.technologyUsedInSnapChat);
		System.out.println(this.technologyUsedInLinkdin);
		System.out.println(this.technologyUsedInFlipkart);
		System.out.println("Ending display");
	}
}