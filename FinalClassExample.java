final class Bike{
	void run(){
		System.out.println("Final Class");
	}
}  
	class FinalClassExample{  
  void run(){
	System.out.println("running safely with 100kmph");
}  
    
  public static void main(String args[]){  
  Bike reduker15 = new Bike(); 
  FinalClassExample honda= new FinalClassExample();  
  honda.run();  
  reduker15.run();
  }  
} 
