// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HashTableExample {
    public static void main(String[] args) {
     /*  Hashtable<Integer, String> table = new Hashtable<Integer, String>(10, 0.5f);
       
       table.put(100, "yea");
       table.put(101, "yea");
       table.put(181, "yeayeyayeyauyyeayayeyayayeyayeyeyayeyayey");
       
        System.out.println("Hash" + "\t" + "Index" + "\t" + "Key"+ "\t" + "Value");
       for(Integer key: table.keySet()){
           System.out.println(key.hashCode() + "\t" + (key.hashCode() % table.size()) + "\t" +key + "\t" + table.get(key));
       } */
       Hashtable<String, String> table = new Hashtable<String, String>(10, 0.5f);
       
       table.put("100", "yea");
       table.put("101", "yea");
       table.put("181", "yeayeyayeyauyyeayayeyayayeyayeyeyayeyayey");
       
        System.out.println("Hash" + "\t" + "Index" + "\t" + "Key"+ "\t" + "Value");
       for(String key: table.keySet()){
           System.out.println(key.hashCode() + "\t" + (key.hashCode() % table.size()) + "\t" +key + "\t" + table.get(key));
       }
       
       
    }
}