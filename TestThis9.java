class A{ 

A getA(){  
 return this;
}  
void msg(){
System.out.println("Hello java");
}  
}  

class TestThis9{  
public static void main(String args[]){  
        new A().getA().msg();  
}  
}
