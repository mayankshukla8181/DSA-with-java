import java.util.HashMap;
import java.util.Map;
public class HashMapBasics {
public static void main(String[] args) {

       Map<String, String> mapping = new HashMap<>();
         
         // insertion
         mapping.put("in", "India");
        // mapping.put("in", "India2");
          mapping.put("pk", "Pakistan");
           mapping.put("en", "England");
            mapping.put("afg", "Afgankistan");
             mapping.put("sa", " Southafrica");
                  System.out.println(mapping);          

              Map<String, String> table = new HashMap<>();
              table.put("br","Brazil");
              System.out.println("before" + table);
              table.putAll(mapping);
              System.out.println("after"+ table);
              // deletion
              table.remove("en");
               System.out.println(table);
               table.putIfAbsent("is ", "India3");
               System.out.println(table);
               System.out.println(table.get("br"));
            //    System.out.println(table.getOfDefult("sa",defultvalue "NONE"));
               System.out.println(table.containsKey("im"));
              System.out.println(table.containsValue("Pakistan"));
              table.replace("in", "Indonosia");
               System.out.println(table);
            //    System.out.println(table.size());
            //    table.clear();
            //    System.out.println(table.size());
                
                
}
}