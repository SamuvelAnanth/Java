import java.util.*;
public class LinkedHashSetExample{
	public static void main(String[] args){
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add("");
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}