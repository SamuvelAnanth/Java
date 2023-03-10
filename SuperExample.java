class AdditionMain{
	String str="Addition";
	public void addition(){
		System.out.println(str+" "+(10+15));
	}
}
class AdditionMain1 extends AdditionMain{
	String str="Duplicate Value";
	public void addition(){
		int c=5+10;
		System.out.println(super.str+" "+c);
		super.addition();
	}
}

class SuperExample extends AdditionMain1{
	public static void main(String[] args){
		SuperExample obj = new SuperExample();
		obj.addition();
	}
}

