import java.util.Arrays;
import java.io.*;

class Bag{
	
	public static void main(String[] values){
		
		int bagCost[]={522,235,678,599,323,199,299,399,499,989};
		short numbers[]={45,23,65,73,88,29,25,36,99,56};
		long mobile[]={1234567890L,6386821879L,2263625365L,5636627272L,6265368633L,266337662L,5262526272L,2621727273L,682374988L,6821763633L};
		char vowels[]={'a','e','i','o','u'};
		double percentage[]={77.53D,65D,87D,88.99D,78D,89D,94D,57D,71D,89D};
		float cgpa[]={7.7f,6.6f,8.8f,9.2f,6.7f,8.2f,7.9f,8.3f,7.4f,6.9f};
		boolean passedStudents[]={true,true,true,false,true,false,true,true,true,false};
		byte regNo[]={1,2,3,4,5,6,7,8,9,10};
		String name[]={"Deepthi","Chetan","manohar","aishwarya","prajwal","archana","brunda","sushma","nandish","bhavana"};
		String cource[]={"MCA","MCA","MBA","MTECH","MTECH","MCA","MBA","MCOM","MCA","MCA"};
		
		
		bagCost[3]=600;
		System.out.println("bagCost is re-assigned "+Arrays.toString(bagCost));
		
		bagCost[2]=300;
		System.out.println("bagCost is re-assigned "+Arrays.toString(bagCost));
		bagCost[7]=400;
		System.out.println("bagCost is re-assigned "+Arrays.toString(bagCost));
		bagCost[5]=250;
		System.out.println("bagCost is re-assigned "+Arrays.toString(bagCost));
		bagCost[8]=800;
		System.out.println("bagCost is re-assigned "+Arrays.toString(bagCost));
		
		
		
		numbers[2]=40;
		System.out.println("numbers is re-assigned "+Arrays.toString(numbers));
		numbers[5]=80;
		System.out.println("numbers is re-assigned "+Arrays.toString(numbers));
		numbers[8]=40;
		System.out.println("numbers is re-assigned "+Arrays.toString(numbers));
		numbers[1]=25;
		System.out.println("numbers is re-assigned "+Arrays.toString(numbers));
		numbers[6]=30;
		System.out.println("numbers is re-assigned "+Arrays.toString(numbers));
		
		mobile[2]=3736466732L;
		System.out.println("mobile is re-assigned "+Arrays.toString(mobile));
		mobile[5]=7869328248L;
		System.out.println("mobile is re-assigned "+Arrays.toString(mobile));
		mobile[8]=3678358732L;
		System.out.println("mobile is re-assigned "+Arrays.toString(mobile));
		mobile[3]=3786877337L;
		System.out.println("mobile is re-assigned "+Arrays.toString(mobile));
		mobile[7]=3763763734L;
		System.out.println("mobile is re-assigned "+Arrays.toString(mobile));
		
		vowels[1]='e';
		vowels[2]='a';
		vowels[3]='u';
		vowels[4]='i';
		vowels[0]='o';
		
		System.out.println("vowels is re-assigned "+Arrays.toString(vowels));
		
		percentage[2]=66.45D;
		percentage[6]=77.54D;
		percentage[7]=69.88D;
		percentage[4]=88.9D;
		percentage[8]=90.23D;
		System.out.println("percentage is re-assigned "+Arrays.toString(percentage));
		
		cgpa[2]=7.7f;
		cgpa[6]=8.6f;
		cgpa[7]=6.7f;
		cgpa[9]=9.4f;
		cgpa[3]=8.2f;
		System.out.println("cgpa is re-assigned "+Arrays.toString(cgpa));
		
		passedStudents[0]=false;
		passedStudents[4]=false;
		passedStudents[3]=true;
		passedStudents[5]=true;
		passedStudents[1]=false;
		System.out.println("passedStudents is re-assigned "+Arrays.toString(passedStudents));
		
		regNo[1]=32;
		regNo[6]=22;
		regNo[3]=21;
		regNo[9]=18;
		regNo[4]=14;
		System.out.println("regNo is re-assigned "+Arrays.toString(regNo));
		
		name[7]="anushree";
		name[4]="anusha";
		name[9]="swapna";
		name[5]="sangeeta";
		name[6]="pooja";
        System.out.println("name is re-assigned "+Arrays.toString(name));
		
		cource[0]="CSE";
		cource[5]="MCOM";
		cource[7]="MCA";
		cource[1]="CSE";
		cource[8]="MBA";
		System.out.println("Course is re-assigned "+Arrays.toString(cource));

		
		System.out.println("starting of bagCost");
		for(int i=0;i<bagCost.length;i++){
			
			System.out.println("values of bagCost"+bagCost[i]);
		}
		
		for(int i=bagCost.length-1;i>0;i--){
			
			System.out.println("reversing "+bagCost[i]);
		}
		for(int i=0;i<bagCost.length;i=i+2){
			
			System.out.println("Skipping the element "+bagCost[i]);
		}
		for(int i=bagCost.length/2;i<bagCost.length;i++){
			
			System.out.println("From middle "+bagCost[i]);
		}
		
		for(int me=0;me<bagCost.length;me++){
			
			if(bagCost[me]%2==0){
				System.out.println(bagCost[me]);
			}
		}
		System.out.println("Ending of bagCost");
		
		System.out.println("starting of numbers");
		for(int i=0;i<numbers.length;i++){
			
			System.out.println("values of numbers "+numbers[i]);
		}
		
		for(int i=numbers.length-1;i>0;i--){
			
			System.out.println("reversing "+numbers[i]);
		}
		for(int i=0;i<numbers.length;i=i+2){
			
			System.out.println("Skipping the element "+numbers[i]);
		}
		for(int i=numbers.length/2;i<numbers.length;i++){
			
			System.out.println("From middle "+numbers[i]);
		}
		
		for(int me=0;me<numbers.length;me++){
			
			if(numbers[me]%2==0){
				System.out.println(numbers[me]);
			}
		}
		System.out.println("Ending of numbers");
		
		System.out.println("starting of mobile");
		for(int i=0;i<mobile.length;i++){
			
			System.out.println("values of mobile "+mobile[i]);
		}
		
		for(int i=mobile.length-1;i>0;i--){
			
			System.out.println("reversing "+mobile[i]);
		}
		for(int i=0;i<mobile.length;i=i+2){
			
			System.out.println("Skipping the element "+mobile[i]);
		}
		for(int i=mobile.length/2;i<mobile.length;i++){
			
			System.out.println("From middle "+mobile[i]);
		}
		
		for(int me=0;me<mobile.length;me++){
			
			if(mobile[me]%2==0){
				System.out.println(mobile[me]);
			}
		}
		System.out.println("Ending of mobile");
		
		System.out.println("starting of vowels");
		for(int i=0;i<vowels.length;i++){
			
			System.out.println("values of vowels "+vowels[i]);
		}
		
		for(int i=vowels.length-1;i>0;i--){
			
			System.out.println("reversing "+vowels[i]);
		}
		for(int i=0;i<vowels.length;i=i+2){
			
			System.out.println("Skipping the element "+vowels[i]);
		}
		for(int i=vowels.length/2;i<vowels.length;i++){
			
			System.out.println("From middle "+vowels[i]);
		}
		
		for(int me=0;me<vowels.length;me++){
			
			if(vowels[me]%2==0){
				System.out.println(vowels[me]);
			}
		}
		System.out.println("ending of vowels");
		
		System.out.println("starting of percentage");
		for(int i=0;i<percentage.length;i++){
			
			System.out.println("values of percentage "+percentage[i]);
		}
		
		for(int i=percentage.length-1;i>0;i--){
			
			System.out.println("reversing "+percentage[i]);
		}
		for(int i=0;i<percentage.length;i=i+2){
			
			System.out.println("Skipping the element "+percentage[i]);
		}
		for(int i=percentage.length/2;i<percentage.length;i++){
			
			System.out.println("From middle "+percentage[i]);
		}
		
		for(int me=0;me<percentage.length;me++){
			
			if(percentage[me]%2==0){
				System.out.println(percentage[me]);
			}
		}
		System.out.println("ending of percentage");
	
	
	System.out.println("starting of cgpa");
		for(int i=0;i<cgpa.length;i++){
			
			System.out.println("values of cgpa"+cgpa[i]);
		}
		
		for(int i=bagCost.length-1;i>0;i--){
			
			System.out.println("reversing "+cgpa[i]);
		}
		for(int i=0;i<cgpa.length;i=i+2){
			
			System.out.println("Skipping the element "+cgpa[i]);
		}
		for(int i=cgpa.length/2;i<cgpa.length;i++){
			
			System.out.println("From middle "+cgpa[i]);
		}
		
		for(int me=0;me<cgpa.length;me++){
			
			if(cgpa[me]%2==0){
				System.out.println(cgpa[me]);
			}
		}
		System.out.println("ending of cgpa");
		
		
		
		System.out.println("starting of regNo");
		for(int i=0;i<regNo.length;i++){
			
			System.out.println("values of bagCost"+regNo[i]);
		}
		
		for(int i=regNo.length-1;i>0;i--){
			
			System.out.println("reversing "+regNo[i]);
		}
		for(int i=0;i<regNo.length;i=i+2){
			
			System.out.println("Skipping the element "+regNo[i]);
		}
		for(int i=regNo.length/2;i<regNo.length;i++){
			
			System.out.println("From middle "+regNo[i]);
		}
		
		for(int me=0;me<regNo.length;me++){
			
			if(regNo[me]%2==0){
				System.out.println(regNo[me]);
			}
		}
		System.out.println("ending of regNo ");
		
		System.out.println("starting of name");
		for(int i=0;i<name.length;i++){
			
			System.out.println("values of name "+name[i]);
		}
		
		for(int i=name.length-1;i>0;i--){
			
			System.out.println("reversing "+name[i]);
		}
		for(int i=0;i<name.length;i=i+2){
			
			System.out.println("Skipping the element "+name[i]);
		}
		for(int i=name.length/2;i<name.length;i++){
			
			System.out.println("From middle "+name[i]);
		}
		
		
		System.out.println("ending of name");
		
		System.out.println("starting of course");
		for(int i=0;i<cource.length;i++){
			
			System.out.println("values of bagCost"+cource[i]);
		}
		
		for(int i=cource.length-1;i>0;i--){
			
			System.out.println("reversing "+cource[i]);
		}
		for(int i=0;i<cource.length;i=i+2){
			
			System.out.println("Skipping the element "+cource[i]);
		}
		for(int i=cource.length/2;i<cource.length;i++){
			
			System.out.println("From middle "+cource[i]);
		}
		
		
		System.out.println("ending of cource");
}
}