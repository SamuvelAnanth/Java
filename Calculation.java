class Calculation{
	int a=5,b=10;
	public void addition(){
	System.out.println(a+b);
} 

	public void sub(){
	System.out.println(a-b);
} 


	public static void main(String[] args){
	Calculation calc = new Calculation();
		new Calculation().addition();
		new Calculation().sub();
	}
}