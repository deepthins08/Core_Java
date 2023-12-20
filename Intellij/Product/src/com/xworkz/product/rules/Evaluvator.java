package com.xworkz.product.rules;

public class Evaluvator {

   private ExamRule examRule;

   public Evaluvator(ExamRule examRule){
       this.examRule=examRule;
   }

   public void evalutaing(){

       boolean name=examRule.name();
       String hallticket=examRule.hallTicket();
       if(name && hallticket !=null){
           System.out.println("Updated the marks of the student");
       }
       else {
           System.out.println("not updated");
       }


   }
}
