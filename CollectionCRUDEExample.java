import java.util.*;
 public class CollectionCRUDEExample {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();
        //add elements
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");

        //accesss element
        System.out.println("Fruit: at index #2 " + fruits.get(2));

        //Modify element
        fruits.set(1, "grapes");
        System.out.println("After modification: "+ fruits);
        //insert element
        fruits.add(1,"kiwi");
        System.out.println("After insert: "+ fruits);
        //Remove element
        fruits.remove("orange");
        System.out.println("After removal: "+ fruits);
        //Check if element avilable
        System.out.println("Is mango avilable? "+fruits.contains("mango"));
        //Get size
        System.out.println("The size of given fruits list is:  "+fruits.size());
    
        //Sort Arraylist
        Collections.sort(fruits);
        System.out.println("After sorting "+fruits);
        //Iterate in arraylist-1
          for(String str : fruits){
            System.out.print("fruit: "+ str);
          }

         // Iterate in arraylist-2(using Itrator/iterator method)
            Iterator<String> iteratorObject = fruits.iterator();
            while(iteratorObject.hasNext()){
              System.out.println("fruit: "+ iteratorObject.next());
            }
        //Clear all element from list
        fruits.clear();
        System.out.println("After clear operation: "+ fruits);

        //checking if empty
        System.out.println("Is fruit list empty? "+ fruits.isEmpty());

    }
}
