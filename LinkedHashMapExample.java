import java.util.*;
class LinkedHashMapExample{
	public static void main(String[] args){
		LinkedHashMap<String,String> hashmap = new LinkedHashMap<String,String>();
		hashmap.put("100","Amit");
		hashmap.put("   ","Vijay");
		hashmap.put("102","Rahul");
		for(Map.Entry m:hashmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}