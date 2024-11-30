// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.* ;

class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("John Doe", 3223);
        employees.put("James", 9393);
        employees.put("Jackson", 92029);
        System.out.println(employees.get("James"));
        System.out.println(employees.containsKey("Jackson")) ;
        System.out.println(employees.containsValue(32323)); 
    }
}