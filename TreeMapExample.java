import java.util.*;

public class TreeMapExample {
   public static void main(String[] args) {
      
      // Create a TreeMap object
      TreeMap<Integer, String> students = new TreeMap<Integer, String>();

      // Add elements to TreeMap
      students.put(1, "Alice");
      students.put(2, "Bob");
      students.put(3, "Charlie");
      students.put(4, "David");

      // Print the TreeMap
      System.out.println("TreeMap: " + students);

      // Get the value of a specific key
      String name = students.get(2);
      System.out.println("Name of student with key 2: " + name);

      // Remove an element from the TreeMap
      students.remove(3);
      System.out.println("TreeMap after removing key 3: " + students);

      // Iterate through the TreeMap
      System.out.println("Iterating through the TreeMap:");
      for(Map.Entry<Integer, String> entry : students.entrySet()) {
         int key = entry.getKey();
         String value = entry.getValue();
         System.out.println("Key: " + key + ", Value: " + value);
      }
   }
}
