class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class FinalMethodExample extends Bike{  
  void run(){
	System.out.println("running safely with 100kmph");
   }  
     
   public static void main(String args[]){  
   FinalMethodExample  honda= new FinalMethodExample();  
   honda.run();  
   }  
} 
