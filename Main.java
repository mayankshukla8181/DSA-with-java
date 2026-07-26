
 import java.util.ArrayList;
// import java.util.Iterator;
import java.util.List;
public class Main {

    public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//         // Add elements
//         list.add(10);
//         list.add(20);
//         list.add(30);

//         System.out.println(list);
// //         list.remove(1);
//         System.out.println(list);
        
        
//         // Second ArrayList
//         ArrayList<Integer> list2 = new ArrayList<>();

//         list2.add(102);
//         list2.add(501);

//         System.out.println("Second List: " + list2);

//         // Add all elements of list2 into list
//         list.addAll(list2);

//         System.out.println("After addAll(): " + list);
//         //i want travesel to travse list by using itrator
//         Iterator<Integer> iterator=list.iterator(); 
//         while(iterator.hasNext()){
//             System.out.println("Element:"+iterator.next());
//         }
//         List<Integer> list3 = new ArrayList<>();
//         list3.add(11);
//         list3.add(12);
//         list3.add(14);
//         System.out.println(list3.get(0));
//          System.out.println(list3.get(2));
//         System.out.println("after set:"+list3);
//         list3.set(0,100);
//         System.out.println("before set:"+list3);
//          // Convert List to Array
//         Object[] arr = list3.toArray();

//         System.out.println("\nArray Elements:");
//         for (Object obj : arr) {
//             System.out.println(obj);
//         }

//         // contains()
//         System.out.println("\nContains 100? " + list3.contains(100));
  
//            list.add(10);
//            list.add(6); 
//            System.out.println("Printing Entire List:" +list);
//            Collections.sort(list);

//         }
// }
        
           List<Student> students = new ArrayList<>();
            students.add(new Student(22,"Mayank",65)); 
            students.add(new Student(21,"Shukla",56));
            students.add(new Student(13,"Manas",34));
            students.add(new Student(12,"Manish",23));
            students.add(new Student(92,"Matte",565));
            Systems.out.println(students);
    }
}