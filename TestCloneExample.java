class TestCloneExample implements Cloneable{
	int rollno;
	String name;
	TestCloneExample(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args){
		try{
			TestCloneExample s1=new TestCloneExample(101,"amit");
			TestCloneExample s2=(TestCloneExample)s1.clone();
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s2.rollno+" "+s2.name);
		} catch(CloneNotSupportedException c){
		}
	}
}