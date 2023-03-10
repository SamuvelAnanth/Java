class B{  
  TestThis8 obj;  
  B(TestThis8 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of TestThis8 class  
  }  
}  


class TestThis8{  
  int data=10;  
  TestThis8(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   TestThis8 a=new TestThis8();  
  }  
} 
