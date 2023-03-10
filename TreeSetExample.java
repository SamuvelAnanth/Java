import java.util.*;
public class TreeSetExample{
	public static void main(String[] args){
		TreeSet<String> set = new TreeSet<String>();
		set.add("Zaritha");
		set.add("Vijay");
		set.add("Antony");
		set.add("Randy");
		//System.out.println(set);
		//Collections.sort(set,Collections.reverseOrder());
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}