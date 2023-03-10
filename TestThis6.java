class TestThis6{  
  void m(TestThis6 obj){  
  System.out.println("method is invoked");  
  }  
  void p(){ 

  m(this);  
  }  
  public static void main(String args[]){  
  TestThis6 s1 = new TestThis6();  
  s1.p();  
  }  
}  
