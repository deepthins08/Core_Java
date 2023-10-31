class Ornament{
	
	String name;
	String type;
	String material;
	String plating;
	
	
	Ornament(){
		super();
	}
	
	Ornament(String name){
		
		super();
		this.name=name;
		System.out.println("Ornament name is :"+name);
	}
	
	Ornament(String name,String type){
		
		super();
		this.name=name;
		this.type=type;
		System.out.println("Ornament name,type is :"+name+","+type);
	}
	
	Ornament(String name,String type,String material){
		
		super();
		this.name=name;
		this.type=type;
		this.material=material;
		System.out.println("Ornament name,type,material is :"+name+","+type+","+material);
	}
	
	Ornament(String name,String type,String material,String plating){
		
		super();
		this.name=name;
		this.type=type;
		this.material=material;
		this.plating=plating;
		System.out.println("Ornament name,type,material,plating is :"+name+","+type+","+material+","+plating);
	}
	
}