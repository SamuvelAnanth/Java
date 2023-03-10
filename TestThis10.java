class TestThis10{  
  
int i;
TestThis10(int i){
this.i = i;
}
TestThis10(){
}


public static void main(String args[]){
TestThis10 obj1=new TestThis10();   
TestThis10 obj=new TestThis10(10);  
System.out.println(obj); //prints the reference ID  
System.out.println(obj1);

}  
}
